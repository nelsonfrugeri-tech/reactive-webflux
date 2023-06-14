package com.dreamtrips.browsing.api;

import com.dreamtrips.browsing.component.WebClientComponent;
import com.dreamtrips.browsing.dto.NobelPrizeResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class NobelApi {

  @Autowired
  private WebClientComponent webClientComponent;

  public Mono<NobelPrizeResponseDto> list(Integer offset, Integer limit, Integer yearTo) {
    return webClientComponent.webClient().get()
        .uri(uriBuilder -> uriBuilder
            .path("/nobelPrizes")
            .queryParam("offset", offset)
            .queryParam("limit", limit)
            .queryParam("yearTo", yearTo)
            .build())
        .retrieve()
        .onStatus(HttpStatusCode::is4xxClientError, response ->
            Mono.error(new RuntimeException("Erro 4xx!")))
        .onStatus(HttpStatusCode::is5xxServerError, response ->
            Mono.error(new RuntimeException("Erro 5xx!")))
        .bodyToMono(NobelPrizeResponseDto.class);
  }
}
