package com.green.legacy.mapper;

import com.green.legacy.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {

  void insertReply(ReplyDTO replyDTO);

  List<ReplyDTO> getReply(int boardNum);

  void replyDelete(int replyNum);
}
