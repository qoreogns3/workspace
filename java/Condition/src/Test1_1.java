import java.util.Scanner;

public class Test1_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("숫자입력 : ");
    int num1 = sc.nextInt();

    System.out.print("숫자입력 : ");
    int num2 = sc.nextInt();

    if (num1 + num2 > 50){
      System.out.println("두 수의 합이 50보다 큽니다");
    }
    else {
      System.out.println("두 수의 합이 50이하입니다.");
    }

  }
}
