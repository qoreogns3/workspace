import java.util.Scanner;

public class Test1_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : ");
    int a = sc.nextInt();
    System.out.print("두번째 수 : ");
    int b = sc.nextInt();

    printInt(a, b);

  }

  public static void printInt(int a, int b){
    if (a % 2 == 0 && b % 2 ==0){
      System.out.println("두 수는 짝수입니다.");
    }

    else if (a % 2 != 0 && b % 2 != 0){
      System.out.println("두 수는 홀수입니다.");
    }

    else {
      System.out.println("한 수만 짝수입니다.");
    }
  }
}
