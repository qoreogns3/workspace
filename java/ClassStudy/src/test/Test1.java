package test;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : ");
    int a = sc.nextInt();
    System.out.print("두번째 수 : ");
    int b = sc.nextInt();
    System.out.print("세번째 수 : ");
    int c = sc.nextInt();

    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    int mid = a + b + c - max - min;

    System.out.println(max);
    System.out.println(mid);
    System.out.println(min);
  }
}
