package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;

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

  //제목 검색 조회 기능
  public List<BoardDTO> getTitleList(String title){
    List<BoardDTO> result = boardMapper.getTitleList(title);
    return result;
  }

  //작성자 검색 조회 기능
  public List<BoardDTO> getWriterList(String writer){
    List<BoardDTO> result = boardMapper.getWriterList(writer);
    return result;
  }

  //댓글 등록 기능
  public void regReply(ReplyDTO replyDTO){
    boardMapper.regReply(replyDTO);
  }

  //댓글 조회 기능
  public List<ReplyDTO> getReplyList(int boardNum){
    return boardMapper.getReplyList(boardNum);
  }

  //댓글 삭제 기능
  public void deleteReply(int replyNum){
    boardMapper.deleteReply(replyNum);
  }

  //보드 댓글 삭제 기능
  public void deleteBoardReply(int boardNum){
    boardMapper.deleteBoardReply(boardNum);
  }
}
