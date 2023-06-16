package com.reactive.webflux.log.decorator;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.ServerWebExchangeDecorator;

public class ExchangeDecorator extends ServerWebExchangeDecorator {

    public ExchangeDecorator(ServerWebExchange delegate) {
      super(delegate);
    }

    @Override
    public ServerHttpRequest getRequest() {
      return new RequestDecorator(getDelegate().getRequest());
    }

    @Override
    public ServerHttpResponse getResponse() {
      return new ResponseDecorator(getDelegate().getResponse());
    }
  }