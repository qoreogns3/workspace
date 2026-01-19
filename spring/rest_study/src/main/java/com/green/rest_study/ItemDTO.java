package com.green.rest_study;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
  private int itemNum;
  private String itemName;
  private int price;
  private String company;
}
