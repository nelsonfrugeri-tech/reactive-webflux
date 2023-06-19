package com.reactive.webflux.log.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;

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
  private ZonedDateTime zonedDateTime;

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
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Setter
  @Getter
  public static class Response {

      @JsonProperty("status_code")
      private int statusCode;

      @JsonInclude(Include.NON_NULL)
      private HttpHeaders headers;

      @JsonInclude(Include.NON_NULL)
      private Object body;
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
