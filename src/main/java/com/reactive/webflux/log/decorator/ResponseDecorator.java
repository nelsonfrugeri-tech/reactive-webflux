package com.reactive.webflux.log.decorator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.reactive.webflux.log.dto.LogDto;
import com.reactive.webflux.log.dto.LogDto.Response;
import java.nio.charset.Charset;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;
import reactor.core.publisher.Mono;

@Slf4j
public class ResponseDecorator extends ServerHttpResponseDecorator {

    private final LogDto logDto;

    public ResponseDecorator(LogDto logDto, ServerHttpResponse delegate) {
      super(delegate);

      this.logDto = logDto;
      logDto.setResponse(new Response());
    }

    @Override
    public Mono<Void> writeWith(Publisher<? extends DataBuffer> body) {
      setResponse();

      if (body instanceof Mono) {
        final var bodyMono = (Mono<? extends DataBuffer>) body;

        return bodyMono.flatMap(dataBuffer -> {
          final var copy = dataBuffer.factory().wrap(dataBuffer.asByteBuffer().asReadOnlyBuffer());
          final var bytes = new byte[copy.readableByteCount()];

          copy.read(bytes);
          try {
            logDto.getResponse().setBody(JsonMapper.builder().findAndAddModules().build()
                .readTree(new String(bytes, Charset.defaultCharset())));
          } catch (JsonProcessingException e) {
            log.error("Failed during the serialization process of the response body: {}",
                e.getMessage());
          }

          return super.writeWith(Mono.just(dataBuffer));
        });
      }
      return super.writeWith(body);
    }

  private void setResponse() {
    logDto.getResponse().setStatusCode(Optional.ofNullable(super.getStatusCode())
        .map(HttpStatusCode::value).orElse(0));
    logDto.getResponse().setHeaders(super.getHeaders());
  }
}