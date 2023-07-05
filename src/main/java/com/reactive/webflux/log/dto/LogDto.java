package com.reactive.webflux.log.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LogDto {

  private Request request;

  private Response response;

  @JsonInclude(Include.NON_NULL)
  private Exception exception;

  @JsonProperty("zone_date_time")
  private ZonedDateTime zonedDateTime;

  @Builder(toBuilder = true)
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
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
  }

  @Builder(toBuilder = true)
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Response {

    @JsonProperty("status_code")
    private int statusCode;

    @JsonInclude(Include.NON_NULL)
    private HttpHeaders headers;

    @JsonInclude(Include.NON_NULL)
    private Object body;
  }

  @Builder
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Exception {

    private String message;

    private String stackTrace;
  }
}

