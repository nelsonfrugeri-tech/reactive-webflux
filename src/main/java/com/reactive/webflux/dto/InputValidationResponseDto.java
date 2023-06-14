package com.reactive.webflux.dto;

import lombok.Getter;

@Getter
public class InputValidationResponseDto extends ResponseDto {

  public InputValidationResponseDto(int output, String message, int errorCode, int input) {
    super(output);
    this.message = message;
    this.errorCode = errorCode;
    this.input = input;
  }

  private String message;
  private int errorCode;
  private int input;

}
