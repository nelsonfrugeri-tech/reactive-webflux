package com.reactive.webflux.component;

import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientComponent {

  public WebClient webClient() {
    return WebClient.builder()
        .baseUrl("https://api.nobelprize.org/2.0")
        .defaultHeaders(headers ->
            Map.of("Content-Type", "application/json").forEach(headers::add))
        .build();
  }
}
