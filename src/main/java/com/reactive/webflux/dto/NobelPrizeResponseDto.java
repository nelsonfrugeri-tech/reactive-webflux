package com.reactive.webflux.dto;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class NobelPrizeResponseDto {

  private List<NobelPrize> nobelPrizes;
  private Meta meta;
  private Links links;

  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  @Getter
  public static class NobelPrize {
    private int awardYear;
    private Map<String, String> category;
    private Map<String, String> categoryFullName;
    private String dateAwarded;
    private int prizeAmount;
    private int prizeAmountAdjusted;
    private Map<String, String> topMotivation;
    private List<Laureate> laureates;

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Getter
    public static class Laureate {
      private int id;
      private Map<String, String> name;
      private String portion;
      private String sortOrder;
      private Map<String, String> motivation;
      private Links links;
    }
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  @Getter
  public static class Meta {
    private int offset;
    private int limit;
    private int nobelPrizeYear;
    private int yearTo;
    private String nobelPrizeCategory;
    private int count;
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  @Getter
  public static class Links {
    private String first;
    private String prev;
    private String self;
    private String next;
    private String last;
  }
}
