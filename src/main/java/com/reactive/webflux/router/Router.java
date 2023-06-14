package com.reactive.webflux.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Router {

  @Autowired
  private Handler handler;

  @Bean
  public RouterFunction<ServerResponse> serverResponseRouterFunction() {
    return RouterFunctions.route()
        .path("/reactive-router", builder -> builder
            .GET("/square/{input}", handler::squareHandler)
            .GET("/square/multiples/{input}", handler::multiples)
            .GET("/square/multiples/{input}/stream", handler::multiplesStream)
            .POST("/multiply", handler::multiply)
            .GET("/nobelPrizes", handler::list))
        .build();
  }
}
