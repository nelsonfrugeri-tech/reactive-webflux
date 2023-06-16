package com.reactive.webflux.log.decorator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reactive.webflux.log.dto.LogDto;
import java.nio.charset.Charset;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;
import reactor.core.publisher.Mono;

@Slf4j
public class ResponseDecorator extends ServerHttpResponseDecorator {

    private final LogDto logDto;

    public ResponseDecorator(LogDto logDto, ServerHttpResponse delegate) {
      super(delegate);
      this.logDto = logDto;
    }

    @Override
    public Mono<Void> writeWith(Publisher<? extends DataBuffer> body) {
      if (body instanceof Mono) {
        final var bodyMono = (Mono<? extends DataBuffer>) body;
        final var objectMapper = new ObjectMapper();

        return bodyMono.flatMap(dataBuffer -> {
          final var copy = dataBuffer.factory().wrap(dataBuffer.asByteBuffer().asReadOnlyBuffer());
          final var bytes = new byte[copy.readableByteCount()];

          copy.read(bytes);
          try {
            logDto.getResponse().setBody(objectMapper.readTree(new String(bytes,
                Charset.defaultCharset())));
          } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
          }

          return super.writeWith(Mono.just(dataBuffer));
        });
      }
      return super.writeWith(body);
    }
}