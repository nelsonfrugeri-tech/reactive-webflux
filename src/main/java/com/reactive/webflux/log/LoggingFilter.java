package com.reactive.webflux.log;

import java.nio.charset.Charset;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.ServerWebExchangeDecorator;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Flux;
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

  private class ExchangeDecorator extends ServerWebExchangeDecorator {

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

  private class RequestDecorator extends ServerHttpRequestDecorator {

    public RequestDecorator(ServerHttpRequest delegate) {
      super(delegate);
    }

    @Override
    public Flux<DataBuffer> getBody() {
      return super.getBody().doOnNext(dataBuffer -> {
        byte[] bytes = new byte[dataBuffer.readableByteCount()];
        dataBuffer.read(bytes);
        String body = new String(bytes, Charset.defaultCharset());
        log.info("Request Body: {}", body);
      });
    }
  }

  private class ResponseDecorator extends ServerHttpResponseDecorator {

    public ResponseDecorator(ServerHttpResponse delegate) {
      super(delegate);
    }

    @Override
    public Mono<Void> writeWith(Publisher<? extends DataBuffer> body) {
      if (body instanceof Mono) {
        Mono<? extends DataBuffer> bodyMono = (Mono<? extends DataBuffer>) body;
        return bodyMono.flatMap(dataBuffer -> {
          // Copy the data buffer
          DataBuffer copy = dataBuffer.factory().wrap(dataBuffer.asByteBuffer().asReadOnlyBuffer());

          // Log the body
          byte[] bytes = new byte[copy.readableByteCount()];
          copy.read(bytes);
          String strContent = new String(bytes, Charset.defaultCharset());
          log.info("Response Body: {}", strContent);

          // Write the original data buffer
          return super.writeWith(Mono.just(dataBuffer));
        });
      }
      return super.writeWith(body);
    }

  }
}



