import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    System.out.print("a : ");
    int a = sc.nextInt();

    System.out.print("b : ");
    int b = sc.nextInt();

    System.out.print("c : ");
    int c = sc.nextInt();

    int d;

    if (a >= b && a >= c){
      d = a;
    }

    else if (b >= a && b >= c){
      d = b;
    }

    else {
      d = c;
    }

    if (d*2 < a + b + c){
      System.out.println("삼각형");
    }
  }
}
