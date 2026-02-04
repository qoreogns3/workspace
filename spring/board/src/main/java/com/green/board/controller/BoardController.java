package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;

import com.green.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }

  //게시판 목록 전체 조회 api
  @GetMapping("")
  public ResponseEntity<?> getList() {
    try {
      log.info("게시글 목록 조회 기능 실행중");
      List<BoardDTO> list = boardService.getList();
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch (Exception e){
      log.error("게시글 목록 조회 중 오류 발생!!!");
      e.printStackTrace(); //오류나는 이유 및 발생 위치를 알려줌
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("오류났어요");
    }
  }

  //게시판 등록 api
  @PostMapping("")
  public ResponseEntity<Object> insertMapping(@RequestBody BoardDTO boardDTO) {
    try {
      boardService.insertItem(boardDTO);
      return ResponseEntity.status(HttpStatus.CREATED).build();
    }catch (Exception e){
      log.error("게시글 등록 중 오류");
      e.printStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }


  }

  //게시판 상세 조회 api
  @GetMapping("/{boardNum}")
  public BoardDTO getDetail(@PathVariable("boardNum") int boardNum) {
    BoardDTO result = boardService.getDetail(boardNum);
    return result;
  }

  //게시판 수정 조회 api
  @GetMapping("/update/{boardNum}")
  public BoardDTO getUpdateBoard(@PathVariable("boardNum") int boardNum) {
    return boardService.getUpdateBoard(boardNum);
  }

  //수정 api
  @PutMapping("/{boardNum}")
  public void updateBoard(@RequestBody BoardDTO boardDTO, @PathVariable("boardNum") int boardNum) {
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }

  //삭제 및 보드 댓글 삭제api
  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum") int boardNum) {
    boardService.deleteBoardReply(boardNum);
    boardService.deleteBoard(boardNum);
  }

  //댓글 등록 api
  @PostMapping("/reply/{boardNum}")
  public void regReply(@RequestBody ReplyDTO replyDTO, @PathVariable("boardNum") int boardNum) {
    replyDTO.setBoardNum(boardNum);
    boardService.regReply(replyDTO);
  }

  //댓글 조회 api
  @GetMapping("/reply/{boardNum}")
  public List<ReplyDTO> getReplyList(@PathVariable("boardNum") int boardNum) {
    return boardService.getReplyList(boardNum);
  }

  //댓글 삭제 api
  @DeleteMapping("/reply/{replyNum}")
  public void deleteReply(@PathVariable("replyNum") int replyNum) {
    boardService.deleteReply(replyNum);
  }

  //제목 검색 조회 api
  @GetMapping("/title/{title}")
  public List<BoardDTO> getTitleList(@PathVariable("title") String title){
    return boardService.getTitleList(title);
  }

  //작성자 검색 조회 api
  @GetMapping("/writer/{writer}")
  public List<BoardDTO> getWriterList(@PathVariable("writer") String writer){
    return boardService.getWriterList(writer);
  }
}