package com.reactive.webflux.log.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LogDto {

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

    private String uri;

    @JsonInclude(Include.NON_NULL)
    private String headers;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("query_parameters")
    private String queryParameters;

    @JsonInclude(Include.NON_NULL)
    private String path;

    @JsonInclude(Include.NON_NULL)
    private Object body;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("execution_body")
    private String exceptionBody;
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Setter
  @Getter
  public static class Response {

    @JsonProperty("status_code")
      private String statusCode;

      @JsonInclude(Include.NON_NULL)
      private String headers;

      @JsonInclude(Include.NON_NULL)
      private Object body;

    @JsonInclude(Include.NON_NULL)
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
