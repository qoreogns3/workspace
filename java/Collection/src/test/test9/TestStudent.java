package test.test9;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();

    Student st1 = new Student("a",100,80);
    Student st2 = new Student("b",60,90);
    Student st3 = new Student("c",100,100);

    list.add(st1);
    list.add(st2);
    list.add(st3);

    for (Student student : list){
      System.out.println(student);
    }

    for (int i = 0; i < list.size(); i++){
      if (list.get(i).getSum() >= 150){
        System.out.println(list.get(i));
      }
    }

    for (Student student : list){
      System.out.println(student.getName() + " = " + student.getSum()/2.0);
    }

    Student st = new Student();
    for (Student student : list){
      if (student.getSum() >= list.get(0).getSum()){
        st = student;
      }
    }
    System.out.println(st);
  }


}
