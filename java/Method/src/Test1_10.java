import java.util.Scanner;

public class Test1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 입력 : ");
    int a = sc.nextInt();

    printInt(a);

  }

  public static void printInt(int a){
    if (a%2 == 0){
      System.out.println("짝수입니다.");
    }
    else {
      System.out.println("홀수입니다.");
    }
//    System.out.println(a % 2 == 0 ? "짝수입니다." : "홀수입니다");
  }
}
