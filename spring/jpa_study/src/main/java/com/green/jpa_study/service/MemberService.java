package com.green.jpa_study.service;

import com.green.jpa_study.dto.MemberResponse;
import com.green.jpa_study.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  //회원 목록 조회
  public List<MemberResponse> findAll(){
    //리턴 타입 : List<Member>
//    List<Member> list = memberRepository.findAll();

    //List<Member> 타입을 List<MemberResponse> 로 변환
//    List<MemberResponse> resultList = new ArrayList<>();
//
//    for(Member m : list){
//      MemberResponse mr = MemberResponse.convertToMemberResponse(m);
//      resultList.add(mr);
//    }
//
//    return resultList;

    return memberRepository.findAll().stream()
            .map(e -> MemberResponse.convertToMemberResponse(e))
            .toList();
  }
}
