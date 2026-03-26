package com.green.security.mapper;

import com.green.security.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

  //회원가입
  void join(MemberDTO memberDTO);

  MemberDTO selectLoginInfo(String memEmail);
}
