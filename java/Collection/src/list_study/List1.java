package list_study;

import java.util.ArrayList;
import java.util.List;

public class List1 {
  public static void main(String[] args) {

    //리스트 : 배열과 같음.

    //정수를 여러개 저장할 수 있는 리스트를 생성
    //int -> Integer
    //double -> Double
    //boolean -> Boolean
    //float -> Float
    List<Integer> list1 = new ArrayList<>();

    //리스트에 데이터를 추가
    list1.add(1);
    list1.add(5);
    list1.add(10);

    //데이터 읽기
    list1.get(1); //1번째 데이터를 리턴하겠다.
    System.out.println(list1.get(2));

    //데이터 삭제
    list1.remove(1); //1번째 요소를 삭제하겠다.

    //리스트에 저장된 데이터의 갯수
    list1.size();

    //실수를 여러개 저장할 수 있는 리스트
    List<Double> list2 = new ArrayList<>();
    list2.add(5.5);
    list2.add(10.5);
    list2.get(1);



    //문자열을 여러개 저장할 수 있는 리스트
    List<String> list3 = new ArrayList<>();
    list3.add("aaa");
    list3.add("bbb");
    list3.get(0);
  }
}
