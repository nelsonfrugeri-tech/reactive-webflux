package com.reactive.webflux.log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reactive.webflux.log.decorator.ExchangeDecorator;
import com.reactive.webflux.log.dto.LogDto;
import com.reactive.webflux.log.dto.LogDto.Request;
import com.reactive.webflux.log.dto.LogDto.Response;
import java.util.Objects;
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
    final var objectMapper = new ObjectMapper();
    final var logDto = new LogDto();

    return requestLogs(logDto, exchange.getRequest())
        .flatMap(lDto -> responseLogs(lDto, exchange.getResponse()))
        .then(chain.filter(new ExchangeDecorator(logDto, exchange)))
        .doOnSuccess(aVoid -> {
          try {
            log.info("Request Successfully: {}", objectMapper.writeValueAsString(logDto));
          } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
          }
        });
  }

  private Mono<LogDto> responseLogs(LogDto logDto, ServerHttpResponse exchange) {
    final var response = new Response();

    response.setStatusCode(Objects.requireNonNull(exchange.getStatusCode()).toString());
    response.setHeaders(exchange.getHeaders().toString());
    logDto.setResponse(response);

    return Mono.just(logDto);
  }

  private Mono<LogDto> requestLogs(LogDto logDto, ServerHttpRequest exchange) {
    final var request = new Request();

    request.setQueryParameters(exchange.getQueryParams().toString());
    request.setPath(exchange.getPath().value());
    request.setMethod(exchange.getMethod().toString());
    request.setUri(exchange.getURI().toString());
    request.setHeaders(exchange.getHeaders().toString());
    logDto.setRequest(request);

    return Mono.just(logDto);
  }
}



