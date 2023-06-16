package com.reactive.webflux.log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reactive.webflux.log.decorator.ExchangeDecorator;
import com.reactive.webflux.log.dto.LogDto;
import com.reactive.webflux.log.dto.LogDto.Request;
import com.reactive.webflux.log.dto.LogDto.Response;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
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

    requestLogs(logDto, exchange);
    responseLogs(logDto, exchange);

    return chain.filter(new ExchangeDecorator(logDto, exchange))
        .doOnSuccess(aVoid -> {
          try {
            log.info("Request Successfully: {}", objectMapper.writeValueAsString(logDto));
          } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
          }
        });
  }

  private static void responseLogs(LogDto logDto, ServerWebExchange exchange) {
    final var response = new Response();

    response.setStatus(Objects.requireNonNull(exchange.getResponse().getStatusCode()).toString());
    response.setHeaders(exchange.getResponse().getHeaders().toString());

    logDto.setResponse(response);
  }

  private static void requestLogs(LogDto logDto, ServerWebExchange exchange) {
    final var request = new Request();

    request.setMethod(exchange.getRequest().getMethod().toString());
    request.setUrl(exchange.getRequest().getURI().toString());
    request.setHeaders(exchange.getRequest().getHeaders().toString());

    logDto.setRequest(request);
  }
}



