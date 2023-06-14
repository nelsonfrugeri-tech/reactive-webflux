package com.dreamtrips.browsing.controller;

import com.dreamtrips.browsing.dto.MultiplyDto;
import com.dreamtrips.browsing.dto.ResponseDto;
import com.dreamtrips.browsing.exception.InputValidationException;
import com.dreamtrips.browsing.service.ReactiveMathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("reactive-math")
public class ReactiveMathController {

  @Autowired
  private ReactiveMathService reactiveMathService;

  @GetMapping("/square/{input}")
  public Mono<ResponseDto> findSquare(@PathVariable int input) {
    if (input < 10) {
      throw new InputValidationException(input);
    }

    return reactiveMathService.findSquare(input);
  }

  @GetMapping("/square/multiples/{input}")
  public Flux<ResponseDto> multiples(@PathVariable int input) {
    return reactiveMathService.multiples(input);
  }

  @GetMapping(value = "/square/multiples/{input}/stream",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Flux<ResponseDto> multiplesStrem(@PathVariable int input) {
    return reactiveMathService.multiples(input);
  }

  @PostMapping("/multiply")
  public Mono<ResponseEntity<ResponseDto>> multiply(@RequestBody Mono<MultiplyDto> requestDto) {
    return reactiveMathService.multiply(requestDto);
  }

}
