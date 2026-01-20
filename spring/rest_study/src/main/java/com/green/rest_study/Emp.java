package com.green.rest_study;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
  private int companyNum;
  private String name;
  private String dptName;
  private int salary;
  private String rank;
}
