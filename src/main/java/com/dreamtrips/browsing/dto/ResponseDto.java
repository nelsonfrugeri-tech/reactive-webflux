package com.dreamtrips.browsing.dto;

import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseDto {

  public ResponseDto(int output) {
    this.output = output;
  }

  private Date date = new Date();
  private int output;
}
