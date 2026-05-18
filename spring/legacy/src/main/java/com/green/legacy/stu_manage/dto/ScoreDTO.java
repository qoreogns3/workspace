package com.green.legacy.stu_manage.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ScoreDTO {
  private int scoreNum;
  private int korScore;
  private int engScore;
  private int mathScore;
  private int stuNum;

  private StuDTO stuDTO;
}
