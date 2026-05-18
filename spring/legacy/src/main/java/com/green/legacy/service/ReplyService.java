package com.green.legacy.service;

import com.green.legacy.dto.ReplyDTO;
import com.green.legacy.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {
  private final ReplyMapper replyMapper;

  public void insertReply(ReplyDTO replyDTO){
    replyMapper.insertReply(replyDTO);
  }

  public List<ReplyDTO> getReply(int boardNum){
    return replyMapper.getReply(boardNum);
  }

  public void replyDelete(int replyNum){
    replyMapper.replyDelete(replyNum);
  }
}
