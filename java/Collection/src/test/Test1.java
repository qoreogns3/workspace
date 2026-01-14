package test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("aa");
    list.add("bb");
    list.add("cc");

    for (String string : list){
      System.out.println(string);
    }
  }
}
