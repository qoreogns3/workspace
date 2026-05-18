package com.green.legacy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardDTO extends PageDTO{
  private int boardNum;
  private String title;
  private String content;
  private String writer;         // FK → LEGACY_USER.USER_ID
  private LocalDateTime regDate;

  @Override
  public String toString() {
    return "BoardDTO{" +
            "boardNum=" + boardNum +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", writer='" + writer + '\'' +
            ", regDate=" + regDate + '\'' +
            super.toString() + '\'' +
            '}';
  }
}
