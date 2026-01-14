import java.util.Scanner;

public class Test1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("점수입력 : ");
    int num = sc.nextInt();

    if (num > 90 && num < 100){
      System.out.println("학점은 A입니다.");
    }

    else if (num > 80 && num <= 90){
      System.out.println("학점은 B입니다.");
    }

    else {
      System.out.println("학점은 C입니다.");
    }
  }
}
