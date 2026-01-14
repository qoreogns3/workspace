package test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10; i++){
      int a = (int)(Math.random()*100) + 1;
      list.add(a);
    }

    int cnt = 0;
    for (int e : list){
      if (e%2 == 0){
        System.out.println(e);
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
