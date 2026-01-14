package study1;

//초급
public class Junior {

  public void devel(){
    System.out.println("신입이 식은땀 흘리며 코딩하고 있습니다.");
  }
}

//중금
class Senior extends Junior{

  public void meeting(){
    System.out.println("고객사와 미팅을 합니다.");
  }

  public void devel(){
    System.out.println("클로드와 제미나이로 5인분 중입니다.");
  }
}
