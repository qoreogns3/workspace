package com.green.test;

import org.springframework.stereotype.Component;

interface Cook {
  void cook();
}

@Component("a") //객체 생성 어노테이션
public class Chef implements Cook {
  public void cook(){
    System.out.println("요리 중");
  }
}

class koreanChef implements Cook {
  public void cook(){
    System.out.println("한식 요리중");
  }
}


