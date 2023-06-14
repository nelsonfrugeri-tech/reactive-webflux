package com.reactive.webflux.service;

import com.reactive.webflux.dto.ResponseDto;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
public class MathService {
  public ResponseDto findSquare(int input) {
    return new ResponseDto(input * input);
  }

  public List<ResponseDto> multiples(int input) {
    return IntStream.rangeClosed(1, 10)
        .peek(i -> sleep(1))
        .peek(i -> System.out.println("math-service processing : " + i))
        .mapToObj(i -> new ResponseDto(i * input))
        .collect(Collectors.toList());
  }

  private static void sleep(int seconds) {
    try {
      Thread.sleep(1000L * seconds);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
