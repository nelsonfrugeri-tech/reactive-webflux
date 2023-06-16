package com.reactive.webflux.log.decorator;

import com.reactive.webflux.log.dto.LogDto;
import java.nio.charset.Charset;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import reactor.core.publisher.Flux;

@Slf4j
public class RequestDecorator extends ServerHttpRequestDecorator {

  private final LogDto logDto;

    public RequestDecorator(LogDto logDto, ServerHttpRequest delegate) {
      super(delegate);
      this.logDto = logDto;
    }

    @Override
    public Flux<DataBuffer> getBody() {
      return super.getBody().doOnNext(dataBuffer -> {
        byte[] bytes = new byte[dataBuffer.readableByteCount()];
        dataBuffer.read(bytes);
        String body = new String(bytes, Charset.defaultCharset());
        logDto.getRequest().setBody(body);
      });
    }
  }