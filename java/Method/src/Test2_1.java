import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(printInt(2,3));

    System.out.print("첫번째 정수 : ");
    int a = sc.nextInt();
    System.out.print("두번째 정수 : ");
    int b = sc.nextInt();

    System.out.println(printMul(a,b));

  }

  public static int printInt(int a, int b){
    return a+b;
  }

  public static int printMul(int a, int b){
    return a*b;
  }
}
