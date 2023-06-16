package com.reactive.webflux.log.decorator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        final var bytes = new byte[dataBuffer.readableByteCount()];
        final var objectMapper = new ObjectMapper();

        dataBuffer.read(bytes);
        try {
          logDto.getRequest().setBody(objectMapper.readTree(new String(bytes,
              Charset.defaultCharset())));
        } catch (JsonProcessingException e) {
          throw new RuntimeException(e);
        }
      });
    }
  }