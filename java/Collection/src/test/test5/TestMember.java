package test.test5;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
  public static void main(String[] args) {
    List<Member> list = new ArrayList<>();

    Member m1 = new Member("aa","a1","aa",20);
    Member m2 = new Member("java","a2","bb",30);
    Member m3 = new Member("cc","a3","cc",40);

    list.add(m1);
    list.add(m2);
    list.add(m3);

    for (Member member : list){
      System.out.println(member);
    }

    int sum = 0;
    for (Member member : list){
      sum = sum + member.getAge();
    }
    System.out.println(sum);

    for (Member member : list){
      if (member.getId().equals("java")){
        list.remove(member);
      }
    }

    for (Member member : list){
      System.out.println(member);
    }
  }
}
