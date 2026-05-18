package com.green.legacy.controller;

import com.green.legacy.dto.ReplyDTO;
import com.green.legacy.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/replys")
public class ReplyController {
  private final ReplyService replyService;

  @RequestMapping("/write")
  public String insertReply(@ModelAttribute ReplyDTO replyDTO){
    replyService.insertReply(replyDTO);
    return "redirect:/boards/detail?boardNum="+replyDTO.getBoardNum();
  }

  @RequestMapping("/delete")
  public String replyDelete(@RequestParam(name="replyNum") int replyNum, @RequestParam(name="boardNum") int boardNum){
    replyService.replyDelete(replyNum);
    return "redirect:/boards/detail?boardNum="+boardNum;
  }
}
