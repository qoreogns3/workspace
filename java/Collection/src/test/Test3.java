package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("홍길동");
    list.add("김길동");
    list.add("이길동");

    for (String string : list){
      if (string.equals("홍길동")){
        System.out.println("해당 이름이 존재합니다.");
      }
    }



  }
}
