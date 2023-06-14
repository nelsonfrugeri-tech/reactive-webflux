package com.reactive.webflux.exception;

public class InputValidationException extends RuntimeException {

  private static final String MSG = "Input must be greater than 10";
  private static final int ERROR_CODE = 100;
  private final int input;

  public InputValidationException(final int input) {
    super(MSG);
    this.input = input;
  }

  public int getInput() {
    return input;
  }

  public int getErrorCode() {
    return ERROR_CODE;
  }

}
