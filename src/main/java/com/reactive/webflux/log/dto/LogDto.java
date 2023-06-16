package com.reactive.webflux.log.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class LogDto {

  private String host;

  private Request request;

  private Response response;
  @JsonInclude(Include.NON_NULL)
  private Exception exception;

  @JsonProperty("zone_date_time")
  private String zonedDateTime;

  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  @Getter
  public static class Request {

    private String method;

    private String url;

    private String headers;

    @JsonProperty("query_parameters")
    private String queryParameters;

    @JsonProperty("method_name")
    private String methodName;

    private String body;

    @JsonProperty("execution_body")
    private String exceptionBody;
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  @Getter
  public static class Response {

      private String status;

      private String headers;

      private String body;

    @JsonProperty("execution_body")
    private String exceptionBody;
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  @Getter
  public static class Exception {

    private String message;

    private String stackTrace;
  }
}
