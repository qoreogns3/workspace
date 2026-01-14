package list_study;

import java.util.ArrayList;
import java.util.List;

public class List2 {
  public static void main(String[] args) {

    //정수를 다수 저장할 수 있는 리스트 생성
    List<Integer> list1 = new ArrayList<>();
    System.out.println(list1.size());

    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);

    //list1에 저장된 모든 정수를 출력
    for (int i = 0; i < list1.size(); i++){
      System.out.println(list1.get(i));
    }

    for (int e : list1){
      System.out.println(e);
    }
  }
}
