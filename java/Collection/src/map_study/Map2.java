package map_study;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
  public static void main(String[] args) {

    //key : 책번호
    Map<Integer, Book> map = new HashMap<>();
    map.put(1001, new Book("자바기본", 1000, "김자바"));
    map.put(1002, new Book("리액트 기본", 2000, "이자바"));
    map.put(1003, new Book("스프링 기본", 3000, "박자바"));

    System.out.println(map.get(1002).getPrice());
  }
}
