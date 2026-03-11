package com.green.car_shop.sale.dto;

import com.green.car_shop.car.dto.CarDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class SaleDTO {
  private int    salesNo;
  private String buyerName;
  private String buyerPhone;
  private String color;
  private LocalDateTime salesDate;
  private int    modelNo;
  private CarDTO carDTO;
}
