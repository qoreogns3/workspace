package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class ReplyDTO {
  private int replyNum;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private int boardNum;
}
