package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();

    list.add(a);
    list.add(b);
    list.add(c);
    list.add(d);
    list.add(e);

    int sum = 0;
    for (int f : list){
      sum = sum + f;
    }
    System.out.println(sum);
  }
}
