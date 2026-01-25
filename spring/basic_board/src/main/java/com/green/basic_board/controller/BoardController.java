package com.green.basic_board.controller;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {
  private BoardService boardService;

  @Autowired
  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  @GetMapping("/test1")
  public String test1(){
    String result = boardService.runTest1();
    return result;
  }

  @GetMapping("/test2")
  public List<Integer> test2(){
    List<Integer> result = boardService.runTest2();
    return result;
  }

  //url : localhost:8080/test3/2
  @GetMapping("/test3/{boardNum}")
  public BoardDTO test3(@PathVariable("boardNum") int boardNum){
    BoardDTO result = boardService.runTest3(boardNum);
    return result;
  }

  @GetMapping("/test4/{boardNum}/{readCnt}")
  public List<BoardDTO> test4(@PathVariable("boardNum") int boardNum, @PathVariable("readCnt") int readCnt){
    BoardDTO dto = new BoardDTO();
    dto.setBoardNum(boardNum);
    dto.setReadCnt(readCnt);
    List<BoardDTO> result = boardService.runTest4(dto);
    return result;

  }
  @PostMapping("/test5")
  public void regBoard(@RequestBody BoardDTO boardDTO){
    boardService.regBoard(boardDTO);
  }

  @PutMapping("/boards/{boardNum}")
  public void updateBoard(@PathVariable("boardNum")int boardNum, @RequestBody BoardDTO boardDTO){
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }

}
