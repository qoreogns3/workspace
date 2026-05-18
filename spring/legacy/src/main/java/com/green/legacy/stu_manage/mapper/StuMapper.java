package com.green.legacy.stu_manage.mapper;

import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {

  List<ClassDTO> selectClass();

  List<StuDTO> selectStuList(int classNum);

  List<StuDTO> selectAllList();

  ScoreDTO getScore(int stuNum);

  void updateScore(ScoreDTO scoreDTO);

  void insertScore(ScoreDTO scoreDTO);
}
