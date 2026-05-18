package com.green.jpa_study.controller;

import com.green.jpa_study.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
@Slf4j
public class MemberController {
  private final MemberService memberService;

  @GetMapping("")
  public ResponseEntity<?> findAll(){
    try{
      return ResponseEntity.status(HttpStatus.OK).body(memberService.findAll());
    }catch (Exception e){
      log.error("조회 실패", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
