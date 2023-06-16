package com.reactive.webflux.log.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
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
  @Setter
  @Getter
  public static class Request {

    private String method;

    private String url;

    private String headers;

    @JsonProperty("query_parameters")
    private String queryParameters;

    @JsonProperty("method_name")
    private String methodName;

    @JsonInclude(Include.NON_NULL)
    private String body;

    @JsonProperty("execution_body")
    private String exceptionBody;
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Setter
  @Getter
  public static class Response {

      private String status;

      private String headers;

      @JsonInclude(Include.NON_NULL)
      private String body;

    @JsonProperty("execution_body")
    private String exceptionBody;
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Setter
  @Getter
  public static class Exception {

    private String message;

    private String stackTrace;
  }
}
