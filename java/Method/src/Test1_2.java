import java.util.Scanner;

public class Test1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    printInt(a);

    System.out.print("첫번째 수 : ");
    int b = sc.nextInt();
    System.out.print("두번째 수 : ");
    int c = sc.nextInt();
    printSum(b, c);


  }

  public static void printInt(int a){
    System.out.println("입력받은 정수 : " + a);
  }

  public static void printSum(int a, int b){
    System.out.println("두수의 합 : " + (a + b));
  }

}
