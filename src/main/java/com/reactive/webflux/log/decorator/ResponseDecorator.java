package com.reactive.webflux.log.decorator;

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
        Mono<? extends DataBuffer> bodyMono = (Mono<? extends DataBuffer>) body;
        return bodyMono.flatMap(dataBuffer -> {
          // Copy the data buffer
          DataBuffer copy = dataBuffer.factory().wrap(dataBuffer.asByteBuffer().asReadOnlyBuffer());

          // Log the body
          byte[] bytes = new byte[copy.readableByteCount()];
          copy.read(bytes);
          String strContent = new String(bytes, Charset.defaultCharset());

          logDto.getResponse().setBody(strContent);

          // Write the original data buffer
          return super.writeWith(Mono.just(dataBuffer));
        });
      }
      return super.writeWith(body);
    }

  }