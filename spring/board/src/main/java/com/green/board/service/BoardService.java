package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
  private BoardMapper boardMapper;

  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  //게시판 목록 전체 조회 기능
  public List<BoardDTO> getList(){
    List<BoardDTO> list = boardMapper.getList();
    return list;
  }
}
