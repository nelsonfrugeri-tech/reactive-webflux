package com.reactive.webflux.log.decorator;

import java.nio.charset.Charset;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import reactor.core.publisher.Flux;

@Slf4j
public class RequestDecorator extends ServerHttpRequestDecorator {

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