package com.dreamtrips.browsing.controller;

import com.dreamtrips.browsing.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("math")
public class MathController {
  @Autowired
  private MathService mathService;

  @GetMapping("/square/{input}")
  public ResponseEntity<?> findSquare(@PathVariable int input) {
    return ResponseEntity.ok().body(mathService.findSquare(input));
  }

  @GetMapping("/square/multiples/{input}")
  public ResponseEntity<?> multiples(@PathVariable int input) {
    return ResponseEntity.ok(mathService.multiples(input));
  }
}
