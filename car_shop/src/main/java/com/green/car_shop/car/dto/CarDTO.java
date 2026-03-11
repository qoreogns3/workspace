package com.green.car_shop.car.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarDTO {
  private int    modelNo;
  private String modelName;
  private int    price;
  private String manufacturer;
}
