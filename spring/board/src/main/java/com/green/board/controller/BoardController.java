package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  //게시판 목록 전체 조회 api
  @GetMapping("")
  public List<BoardDTO> getList(){
    List<BoardDTO> list = boardService.getList();
    return list;
  }
}
