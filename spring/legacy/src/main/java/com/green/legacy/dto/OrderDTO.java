package com.green.legacy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
  private String menu;
  private int num;
  private String add;
  private String need;
}
