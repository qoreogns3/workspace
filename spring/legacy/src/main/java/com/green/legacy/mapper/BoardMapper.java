package com.green.legacy.mapper;

import com.green.legacy.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

  List<BoardDTO> selectBoardList(BoardDTO boardDTO);

  void insertBoard(BoardDTO boardDTO);

  BoardDTO getDetail(int boardNum);

  void deleteBoard(int boardNum);

  void updateBoard(BoardDTO boardDTO);

  int selectBoardCnt();
}
