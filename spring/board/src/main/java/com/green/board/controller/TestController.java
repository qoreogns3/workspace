package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/test1")
  public ResponseEntity<String> test1(){
    String name = "kim";

    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(name);
  }

  @GetMapping("/test2")
  public ResponseEntity<BoardDTO> test2(){
    BoardDTO boardDTO = new BoardDTO();
    boardDTO.setBoardNum(1);
    boardDTO.setWriter("제목");
    boardDTO.setWriter("작성자");
    boardDTO.setContent("내용");

    //헤더에 실을 데이터
    HttpHeaders headers = new HttpHeaders();
    headers.add("myName","key");
    headers.add("myAge", "30");
    return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(boardDTO);
  }

  @GetMapping("/test3")
  public ResponseEntity<?> test3(){
    System.out.println("기능 성공");
    //return할 데이터가 없으면 build() 메서드를 마지막에 호출!
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }
}
