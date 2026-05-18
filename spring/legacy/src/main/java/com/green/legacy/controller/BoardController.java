package com.green.legacy.controller;

import com.green.legacy.dto.BoardDTO;
import com.green.legacy.dto.ReplyDTO;
import com.green.legacy.service.BoardService;
import com.green.legacy.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
//객체 생성, 해당 클래스는 컨트롤러 역할임을 스프링한테 인지 (비동기 미지원)
public class BoardController {
  private final BoardService boardService;
  private final ReplyService replyService;

  //게시글 목록('/boards/getList')
  //조회, 등록, 삭제, 수정 전부 @RequestMapping 어노테이션 사용
  //컨트롤러에서 요청을 처리하는 메서드의 리턴타입은 무조건 문자열
  //레거시 방식에서 리턴되는 정보는 보여질 html 파일명을 의미함
  //매개변수에 선언한 Model 인터페이스 객체는 데이터를 적재하는 역할
  @RequestMapping("/getList")
  //컨트롤러의 메서드 매개변수에 dto클래스를 전달받으면 객체를 알아서 생성
  //이러한 객체를 커맨드객체라 부른다. 커맨드객체는 자동으로 HTML로 전달됨
  //커맨드객체가 HTML로 전달될때에는 객체명이 아니라 클래스명에서 앞글자만 소문자로 바뀐채로 넘어감
  public String getList(@ModelAttribute BoardDTO boardDTO, Model model){

    //전체 데이터 수 조회
    boardDTO.setTotalDataCnt(boardService.selectBoardCnt());
    //페이징 정보 세팅
    boardDTO.setPageINFO();

    System.out.println(boardDTO.toString());

    //조회한 게시글 목록을 html로 전달
    List<BoardDTO> boardDTOList = boardService.selectBoardList(boardDTO);
    model.addAttribute("boardList", boardDTOList);

    //html 파일은 무조건 resources/templates 폴더 안 위치
    return "board_list";
  }

  //글쓰기 페이지로 이동
  @RequestMapping("/go-write")
  public String goWrite(){
    return "reg_board";
  }

  //글쓰기 기능 실행
  //@ModelAttribute 클래스명 객체명
  // -> input 태크의 name 속성고 동일한 멤버변수를 가진 dto 클래스가 데이터 받음
  @RequestMapping("/write")
  public String write(@ModelAttribute BoardDTO boardDTO){
    System.out.println(boardDTO);

    boardService.insertBoard(boardDTO);

    //return에는 기본적으로 html파일명을 작성
    //추가적으로 html파일명이 아니라, 컨트롤러의 다른 메서드를 호출
    // -> "redirect:요청url"
    return "reg_result"; //게시글 등록 성공 여부에 따라 alert를 띄울 목적의 html
  }

  //RequestParam 어노테이션을 이용하면 데이터를 하나씩 받을 수 있음
  @RequestMapping("/write2")
  public String write2(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age){
    System.out.println("name : " + name);
    System.out.println("age : " + age);
    return "reg_board";
  }

  @RequestMapping("/detail")
  public String getDetail(@RequestParam(name = "boardNum") int boardNum, Model model){
    BoardDTO boardDTO = boardService.getDetail(boardNum);
    List<ReplyDTO> replyDTOS = replyService.getReply(boardNum);
    model.addAttribute("board",boardDTO);
    model.addAttribute("replyList",replyDTOS);
    return "board_detail";
  }

  @RequestMapping("/delete/{boardNum}")
  public String deleteBoard(@PathVariable("boardNum") int boardNum){
    System.out.println("삭제중");
    boardService.deleteBoard(boardNum);
    return "delete_result";
  }

  @RequestMapping("/update-form")
  public String goUpdate(@RequestParam(name="boardNum") int boardNum, Model model){
    //게시글 상세 정보 조회
    BoardDTO boardDTO = boardService.getDetail(boardNum);

    //상세 정보를 html 전달
    model.addAttribute("board", boardDTO);
    return "update_form";
  }

  @RequestMapping("/update")
  public String updateBoard(@ModelAttribute BoardDTO boardDTO){
    boardService.updateBoard(boardDTO);
    int boardNum = boardDTO.getBoardNum();
    return "redirect:/boards/detail?boardNum="+boardNum;
  }


}
