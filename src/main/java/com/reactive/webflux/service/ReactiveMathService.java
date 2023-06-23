package com.reactive.webflux.service;

import com.reactive.webflux.dto.InputValidationResponseDto;
import com.reactive.webflux.dto.MultiplyDto;
import com.reactive.webflux.dto.ResponseDto;
import com.reactive.webflux.exception.InputValidationException;
import java.time.Duration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveMathService {

  public Mono<ResponseDto> findSquare(int input) {
    if (input < 10) {
      return Mono.error(new InputValidationException(input));
    }
    return Mono.fromSupplier( () -> new ResponseDto(input * input));
  }

  public Flux<ResponseDto> multiples(int input) {
    return Flux.just(input).handle(((integer, sink) -> {
      if (integer < 10) {
        sink.error(new InputValidationException(integer));
      } else {
        sink.next(integer);
      }
    })).flatMap(i -> Flux.range(1, 10)
        .delayElements(Duration.ofSeconds(1))
        .doOnNext(y -> System.out.println("math-service processing : " + y))
        .map(z -> new ResponseDto(z * input)));
  }

  public Mono<ResponseEntity<ResponseDto>> multiply(Mono<MultiplyDto> requestDto) {
    return requestDto
        .filter(dto -> dto.getFirst() > 10 && dto.getSecond() > 10)
        .flatMap(dto ->
            Mono.just(
                ResponseEntity.ok(
                    new ResponseDto(dto.getFirst() * dto.getSecond())
                )
            )
        )
        .defaultIfEmpty(ResponseEntity.badRequest()
            .body(new InputValidationResponseDto(1, "", 100, 1)));
  }

  public Mono<ResponseDto> multiplication(Mono<MultiplyDto> requestDto) {
    return requestDto
        .filter(dto -> dto.getFirst() > 10 && dto.getSecond() > 10)
        .flatMap(dto -> Mono.just(
            new ResponseDto(dto.getFirst() * dto.getSecond())
        ))
        .defaultIfEmpty(new ResponseDto(0));
  }
}
