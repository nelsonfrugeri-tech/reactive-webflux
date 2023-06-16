package com.reactive.webflux.log.decorator;

import com.reactive.webflux.log.dto.LogDto;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.ServerWebExchangeDecorator;

public class ExchangeDecorator extends ServerWebExchangeDecorator {

  private final LogDto logDto;

    public ExchangeDecorator(LogDto logDto, ServerWebExchange delegate) {
      super(delegate);
      this.logDto = logDto;
    }

    @Override
    public ServerHttpRequest getRequest() {
      return new RequestDecorator(logDto, getDelegate().getRequest());
    }

    @Override
    public ServerHttpResponse getResponse() {
      return new ResponseDecorator(logDto, getDelegate().getResponse());
    }
  }