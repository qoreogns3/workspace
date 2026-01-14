import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Test2_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 정수 : ");
    int a = sc.nextInt();

    System.out.print("두번째 정수 : ");
    int b = sc.nextInt();

    System.out.println(printInt(a,b));

    System.out.print("첫번째 문자열 : ");
    String c = sc.next();
    System.out.print("두번째 문자열 : ");
    String d = sc.next();

    System.out.println(printStr(c,d));
  }

  public static int printInt(int a, int b){
    return Math.max(a, b);
  }

  public static String printStr(String a, String b){
    return a+b;
  }
}
