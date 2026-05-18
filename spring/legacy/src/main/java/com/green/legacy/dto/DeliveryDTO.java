package com.green.legacy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeliveryDTO {
  private String orderer;
  private String phone;
  private String addr;
}
