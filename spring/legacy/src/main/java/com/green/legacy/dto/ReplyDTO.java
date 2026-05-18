package com.green.legacy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ReplyDTO {
  private int replyNum;
  private String replyContent;
  private String replyWriter;    // FK → LEGACY_USER.USER_ID
  private LocalDateTime regDate;
  private int boardNum;
}
