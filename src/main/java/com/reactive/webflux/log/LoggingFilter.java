package com.reactive.webflux.log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.reactive.webflux.exception.InputValidationException;
import com.reactive.webflux.log.decorator.ExchangeDecorator;
import com.reactive.webflux.log.dto.LogDto;
import com.reactive.webflux.log.dto.LogDto.Exception;
import com.reactive.webflux.log.dto.LogDto.Request;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Slf4j
public class LoggingFilter implements WebFilter, WebExceptionHandler {

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
    final var logDto = new LogDto();

    return setRequestLogs(logDto, exchange.getRequest())
        .flatMap(this::setZonedDateTime)
        .then(chain.filter(new ExchangeDecorator(logDto, exchange)))
        .doOnSuccess(aVoid -> logSuccessfully(logDto))
        .doOnError(ex -> logException(logDto, ex))
        .doFinally(signalType -> {
          if (signalType.name().equals("ON_ERROR")) {
            log.info("Request Canceled: {}", exchange.getResponse().getStatusCode());
          }
        });
  }

  private static void logSuccessfully(LogDto logDto) {
    try {
      log.info("Request Successfully: {}", JsonMapper.builder().findAndAddModules().build()
          .writeValueAsString(logDto));
    } catch (JsonProcessingException e) {
      log.error("Failed during the serialization process of the log payload: {}",
          e.getMessage());
    }
  }

  private Mono<Void> logException(LogDto logDto, Throwable ex) {
    try {
      log.info("Request Exception: {}", JsonMapper.builder().findAndAddModules().build()
          .writeValueAsString(setException(logDto, ex)));
    } catch (JsonProcessingException e) {
      log.error("Failed during the serialization process of the log payload: {}",
          e.getMessage());
    }

    return Mono.error(ex);
  }

  private LogDto setException(LogDto logDto, Throwable ex) {
    logDto.setException(Exception.builder()
        .message(ex.getMessage())
        .stackTrace(getStackTraceAsString(ex))
        .build());

    return logDto;
  }

  private Mono<LogDto> setRequestLogs(LogDto logDto, ServerHttpRequest exchange) {
    final var request = new Request();

    request.setQueryParameters(exchange.getQueryParams().toString());
    request.setPath(exchange.getPath().value());
    request.setMethod(exchange.getMethod().toString());
    request.setUri(exchange.getURI().toString());
    request.setHeaders(exchange.getHeaders().toString());
    logDto.setRequest(request);

    return Mono.just(logDto);
  }

  private String getStackTraceAsString(Throwable ex) {
    final var stringWriter = new StringWriter();
    ex.printStackTrace(new PrintWriter(stringWriter));
    return stringWriter.toString();
  }

  private Mono<LogDto> setZonedDateTime(LogDto logDto) {
    logDto.setZonedDateTime(ZonedDateTime.now(ZoneId.of("UTC")));
    return Mono.just(logDto);
  }

  @Override
  public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
    if (ex instanceof InputValidationException) {
      ServerHttpResponse response = exchange.getResponse();
      response.setStatusCode(HttpStatus.BAD_REQUEST);
      DataBuffer buffer = response.bufferFactory().wrap(ex.getMessage().getBytes(StandardCharsets.UTF_8));
      return response.writeWith(Mono.just(buffer));
    } else {
      return Mono.error(ex);
    }
  }
}
