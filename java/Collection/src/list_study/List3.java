package list_study;

import java.util.ArrayList;
import java.util.List;

public class List3 {
  public static void main(String[] args) {

    //Man 자료형을 다수 저장할 수 있는 리스트 생성

    List<Man> list = new ArrayList<>();

    //list에 Man 객체 3개를 저장
    Man m1 = new Man("kim", 20);
    Man m2 = new Man("lee", 30);
    Man m3 = new Man("choi", 40);
    list.add(m1);
    list.add(m2);
    list.add(m3);

    //문제1. 리스트에 저장된 사람 중 나이가 30 이상인 사람의 이름을 출력
    for (int i = 0; i < list.size(); i++){
      if (list.get(i).getAge() >= 30){
        System.out.println(list.get(i).getName());
      }
    }

    for (Man man : list){
      if (man.getAge() >= 30){
        System.out.println(man.getName());
      }
    }
  }
}
