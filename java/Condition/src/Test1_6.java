import java.util.Scanner;

public class Test1_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수입력 : ");
    int num = sc.nextInt();

    if (num % 5 != 0){
      System.out.println("5의 배수를 입력하세요.");
    }
  }
}
