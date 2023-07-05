package com.reactive.webflux.log;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.reactive.webflux.log.decorator.ExchangeDecorator;
import com.reactive.webflux.log.dto.LogDto;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Slf4j
public class LoggingFilter implements WebFilter {

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
    return Mono.fromSupplier(() -> LogDto.builder().build())
        .flatMap(logDto -> setRequestLogs(logDto, exchange.getRequest()))
        .flatMap(this::setResponse)
        .flatMap(this::setZonedDateTime)
        .flatMap(logDto -> chain.filter(new ExchangeDecorator(logDto, exchange))
            .thenReturn(logDto))
        .flatMap(logDto ->
            logMessage(logDto, "Request Successfully"))
        .onErrorResume(ex ->
            logMessage(setException(LogDto.builder().build(), ex), "Request Exception"));
  }

  private Mono<Void> logMessage(LogDto logDto, String message) {
    return serializeLogDto(logDto)
        .doOnSuccess(serializedLogDto -> log.info("{}: {}", message, serializedLogDto))
        .then(Mono.empty());
  }

  private Mono<String> serializeLogDto(LogDto logDto) {
    return Mono.fromCallable(() -> JsonMapper.builder().findAndAddModules().build()
            .writeValueAsString(logDto))
        .doOnError(e -> log.error("Failed during the serialization process of the log payload: {}",
            e.getMessage()))
        .onErrorReturn("Serialization Error");
  }

  private LogDto setException(LogDto logDto, Throwable ex) {
    return logDto.toBuilder()
        .exception(LogDto.Exception.builder()
            .message(ex.getMessage())
            .stackTrace(getStackTraceAsString(ex))
            .build())
        .build();
  }

  private Mono<LogDto> setRequestLogs(LogDto logDto, ServerHttpRequest exchange) {
    return Mono.just(logDto.toBuilder().request(LogDto.Request.builder()
        .queryParameters(exchange.getQueryParams().toString())
        .path(exchange.getPath().value())
        .method(exchange.getMethod().toString())
        .uri(exchange.getURI().toString())
        .headers(exchange.getHeaders().toString())
        .build()).build());
  }

  private Mono<LogDto> setResponse(LogDto logDto) {
    return Mono.just(logDto.toBuilder().response(LogDto.Response.builder()
        .build()).build());
  }

  private String getStackTraceAsString(Throwable ex) {
    final var stringWriter = new StringWriter();
    ex.printStackTrace(new PrintWriter(stringWriter));
    return stringWriter.toString();
  }

  private Mono<LogDto> setZonedDateTime(LogDto logDto) {
    return Mono.just(logDto.toBuilder()
        .zonedDateTime(ZonedDateTime.now(ZoneId.of("UTC"))).build());
  }
}
