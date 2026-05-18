package com.green.legacy.stu_manage.controller;

import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import com.green.legacy.stu_manage.service.StuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/stus")
public class StuController {
  private final StuService stuService;

  @RequestMapping("/getClass")
  public String selectClass(@RequestParam(name = "classNum", required = false, defaultValue = "0") Integer classNum, Model model){
    List<ClassDTO> classDTOList = stuService.selectClass();
    model.addAttribute("classList",classDTOList);
    System.out.println("클래스번호 = " + classNum);

    if (classNum == null || classNum == 0){
      model.addAttribute("stuList", stuService.selectAllList());
    }else {
      model.addAttribute("stuList", stuService.selectStuList(classNum));
    }

    model.addAttribute("selectedClassNum", classNum);


    return "stu/stu_list";
  }

  @ResponseBody //이 메서드는 비동기 메서드임을 인지
  @RequestMapping("/list")
  public List<StuDTO> getStuList(@RequestParam(name = "classNum") int classNum){
    if (classNum == 0){
      return stuService.selectAllList();
    } else {
      return stuService.selectStuList(classNum);
    }
  }

  @ResponseBody
  @RequestMapping("/score")
  public ScoreDTO getScore(@RequestParam(name = "stuNum") int stuNum){
    return stuService.getScore(stuNum);
  }

  @RequestMapping("/update")
  public String updateScore(@ModelAttribute ScoreDTO scoreDTO){
    System.out.println(scoreDTO);
    if (scoreDTO.getScoreNum() == 0){
      stuService.insertScore(scoreDTO);
    }
    else {
      stuService.updateScore(scoreDTO);
    }
    return "stu/score_result";
  }
}
