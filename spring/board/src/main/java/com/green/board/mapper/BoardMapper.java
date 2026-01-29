package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

  //게시판 목록 전체 조회 메서드
  List<BoardDTO> getList();

  //게시판 등록 메서드
  void insertBoard(BoardDTO boardDTO);

  //게시판 상세 조회 메서드
  BoardDTO getDetail(int boardNum);

  //조회수 증가 메서드
  void cnt(int boardNum);

  //수정 메서드
  void updateBoard(BoardDTO boardDTO);

  //삭제 메서드
  void deleteBoard(int boardNum);

  //제목 검색 조회 메서드
  List<BoardDTO> getTitleList(String title);

  //작성자 검색 조회 메서드
  List<BoardDTO> getWriterList(String writer);

  //댓글 등록 메서드
  void regReply(ReplyDTO replyDTO);

  //댓글 조회 메서드
  List<ReplyDTO> getReplyList(int boardNum);

  //댓글 삭제 메서드
  void deleteReply(int replyNum);

  //보드 댓글 삭제 메서드
  void deleteBoardReply(int BoardNum);
}
