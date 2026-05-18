package com.green.legacy.stu_manage.service;

import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import com.green.legacy.stu_manage.mapper.StuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StuService {
  private final StuMapper stuMapper;
  public List<ClassDTO> selectClass(){
    return stuMapper.selectClass();
  }

  public List<StuDTO> selectStuList(int classNum){
    return stuMapper.selectStuList(classNum);
  }

  public List<StuDTO> selectAllList(){
    return stuMapper.selectAllList();
  }

  public ScoreDTO getScore(int stuNum){
    return stuMapper.getScore(stuNum);
  }

  public void updateScore(ScoreDTO scoreDTO){
    stuMapper.updateScore(scoreDTO);
  }

  public void insertScore(ScoreDTO scoreDTO){
    stuMapper.insertScore(scoreDTO);
  }
}
