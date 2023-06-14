package com.reactive.webflux.router;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.MultiplyDto;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import com.reactive.webflux.dto.ResponseDto;
import com.reactive.webflux.service.ReactiveMathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class Handler {

  @Autowired
  private ReactiveMathService reactiveMathService;

  @Autowired
  private NobelApi nobelApi;

  public Mono<ServerResponse> list(ServerRequest serverRequest) {
    return ServerResponse.ok().body(nobelApi.list(
        serverRequest.queryParam("offset").map(Integer::parseInt).orElse(0),
        serverRequest.queryParam("limit").map(Integer::parseInt).orElse(0),
        serverRequest.queryParam("yearTo").map(Integer::parseInt).orElse(0)),
        NobelPrizeResponseDto.class);
  }

  public Mono<ServerResponse> squareHandler(ServerRequest serverRequest) {
    return ServerResponse.ok().body(reactiveMathService.findSquare(
        Integer.parseInt(serverRequest.pathVariable("input"))), ResponseDto.class);
  }

  public Mono<ServerResponse> multiples(ServerRequest serverRequest) {
    return ServerResponse.ok().body(reactiveMathService.multiples(
        Integer.parseInt(serverRequest.pathVariable("input"))), ResponseDto.class);
  }

  public Mono<ServerResponse> multiplesStream(ServerRequest serverRequest) {
    return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM)
        .body(reactiveMathService.multiples(
        Integer.parseInt(serverRequest.pathVariable("input"))), ResponseDto.class);
  }

  public Mono<ServerResponse> multiply(ServerRequest serverRequest) {
    return ServerResponse.ok().body(reactiveMathService.multiply(
        serverRequest.bodyToMono(MultiplyDto.class)).map(HttpEntity::getBody), ResponseDto.class);
  }
}
