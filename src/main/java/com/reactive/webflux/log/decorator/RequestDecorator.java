package com.reactive.webflux.log.decorator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.reactive.webflux.log.dto.LogDto;
import java.nio.charset.Charset;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
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
    return DataBufferUtils.join(super.getBody())
        .flatMapMany(dataBuffer -> {
          final var bytes = new byte[dataBuffer.readableByteCount()];

          dataBuffer.read(bytes);
          DataBufferUtils.release(dataBuffer);

          try {
            logDto.getRequest().toBuilder().body(JsonMapper.builder().findAndAddModules().build()
                .readTree(new String(bytes, Charset.defaultCharset())));
          } catch (JsonProcessingException e) {
            log.error("Failed during the serialization process of the request body: {}", e.getMessage());
          }

          return Flux.just(bytes)
              .map(b -> dataBuffer.factory().wrap(b));
        });
  }
}