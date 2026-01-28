package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

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

  //게시판 등록 api
  @PostMapping("")
  public void insertMapping(@RequestBody BoardDTO boardDTO){
    boardService.insertItem(boardDTO);
  }

  //게시판 상세 조회 api
  @GetMapping("/{boardNum}")
  public BoardDTO getDetail(@PathVariable("boardNum") int boardNum){
    BoardDTO result = boardService.getDetail(boardNum);
    boardService.cnt(boardNum);
    return result;
  }

  //수정 api
  @PutMapping("/{boardNum}")
  public void updateBoard(@RequestBody BoardDTO boardDTO, @PathVariable("boardNum") int boardNum){
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }

  //삭제 api
  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum") int boardNum){
    boardService.deleteBoard(boardNum);
  }
}
