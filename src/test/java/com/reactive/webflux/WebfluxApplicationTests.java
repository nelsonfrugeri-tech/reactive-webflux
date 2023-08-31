package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}cpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}kpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}gpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
} package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}cpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}mpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}cpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}vpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}wpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}bpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}fpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}lpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}upackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}xpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
};package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}mpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
} package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}gpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}jpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}upackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}npackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}jpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}upackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
};package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}mpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
} package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}gpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}npackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}gpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}fpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}mpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}wpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}kpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}bpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}cpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}npackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}xpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}.package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}npackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}gpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Bpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
};package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}@package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}rpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}npackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}gpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Bpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}cpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}lpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
} package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Wpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}bpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}fpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}lpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}upackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}xpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ppackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}lpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}cpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}npackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
} package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}{package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}	package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}@package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}	package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}vpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}ipackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}dpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
} package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}cpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}npackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}epackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}xpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}tpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}Lpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}opackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}apackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}dpackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}spackage com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}(package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
})package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
} package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}{package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}	package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}}package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
}}package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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
package com.reactive.webflux.api;

import com.reactive.webflux.component.WebClientComponent;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
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