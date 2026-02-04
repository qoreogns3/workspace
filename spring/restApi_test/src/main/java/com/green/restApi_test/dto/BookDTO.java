package com.green.restApi_test.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
  private int bookNum;
  private String bookTitle;
  private String author;
  private String bookIntro;
  private int bookPrice;

}
