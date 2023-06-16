package com.reactive.webflux.log;

import com.reactive.webflux.log.decorator.ExchangeDecorator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Slf4j
public class LoggingFilter implements WebFilter {

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
    requestLogs(exchange);
    responseLogs(exchange);

    return chain.filter(new ExchangeDecorator(exchange));
  }

  private static void responseLogs(ServerWebExchange exchange) {
    log.info("Response Headers: {}", exchange.getResponse().getHeaders());
    log.info("Response Status Code: {}", exchange.getResponse().getStatusCode());
  }

  private static void requestLogs(ServerWebExchange exchange) {
    log.info("Request Method: {}", exchange.getRequest().getMethod());
    log.info("Request URI: {}", exchange.getRequest().getURI());
    log.info("Request Headers: {}", exchange.getRequest().getHeaders());
  }
}



