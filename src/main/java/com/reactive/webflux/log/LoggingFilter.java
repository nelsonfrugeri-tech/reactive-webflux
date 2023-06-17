package com.reactive.webflux.log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.reactive.webflux.log.decorator.ExchangeDecorator;
import com.reactive.webflux.log.dto.LogDto;
import com.reactive.webflux.log.dto.LogDto.Request;
import com.reactive.webflux.log.dto.LogDto.Response;
import com.reactive.webflux.log.dto.LogDto.Response.Status;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Slf4j
public class LoggingFilter implements WebFilter {

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
    final var logDto = new LogDto();

    return setRequestLogs(logDto, exchange.getRequest())
        .flatMap(lDto -> setResponseLogs(lDto, exchange.getResponse()))
        .flatMap(this::setZonedDateTime)
        .then(chain.filter(new ExchangeDecorator(logDto, exchange)))
        .doOnSuccess(aVoid -> {
          try {
            log.info("Request Successfully: {}", JsonMapper.builder().findAndAddModules().build()
                .writeValueAsString(logDto));
          } catch (JsonProcessingException e) {
            log.error("Failed during the serialization process of the log payload: {}",
                e.getMessage());
          }
        });
  }

  private Mono<LogDto> setResponseLogs(LogDto logDto, ServerHttpResponse exchange) {
    final var response = new Response();

    setStatus(exchange, response);
    response.setHeaders(exchange.getHeaders().toString());
    logDto.setResponse(response);

    return Mono.just(logDto);
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

  private static void setStatus(ServerHttpResponse exchange, Response response) {

    Optional<String> status = Optional.ofNullable(exchange).map(ServerHttpResponse::getStatusCode)
        .map(Objects::toString);

    response.setStatus(Status.builder()
        .code(status.map(s -> s.split(" ")[0]).orElse(""))
        .message(status.map(s -> s.split(" ")[1]).orElse(""))
        .build());
  }

  private Mono<LogDto> setZonedDateTime(LogDto logDto) {
    logDto.setZonedDateTime(ZonedDateTime.now(ZoneId.of("UTC")));
    return Mono.just(logDto);
  }
}



