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

  //게시판 등록 기능
  public void insertItem(BoardDTO boardDTO){
    System.out.println("게시판 등록");
    boardMapper.insertBoard(boardDTO);
  }

  //게시판 상세 조회 기능
  public BoardDTO getDetail(int boardNum){
    BoardDTO boardDTO = boardMapper.getDetail(boardNum);
    return boardDTO;
  }

  //조회수 기능
  public void cnt(int boardNum){
    boardMapper.cnt(boardNum);
  }

  //수정 기능
  public void updateBoard(BoardDTO boardDTO){
    boardMapper.updateBoard(boardDTO);
  }

  //삭제 기능
  public void deleteBoard(int boardNum){
    boardMapper.deleteBoard(boardNum);
  }
}
