import java.util.Scanner;

public class Test1_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("a : ");
    int a = sc.nextInt();

    System.out.print("b : ");
    int b = sc.nextInt();

    if (a > b){
      System.out.println("a가 큽니다.");
    }

    else if (a < b){
      System.out.println("b가 큽니다.");
    }

    else {
      System.out.println("같습니다");
    }

  }
}
