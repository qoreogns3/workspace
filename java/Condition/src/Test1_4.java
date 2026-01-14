import java.util.Scanner;

public class Test1_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수입력 : ");
    int num = sc.nextInt();

    if (num % 3 == 0){
      System.out.println("3의 배수입니다.");
    }
  }
}
