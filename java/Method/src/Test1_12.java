import java.util.Scanner;

public class Test1_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("수 입력 : ");
    int a = sc.nextInt();
    printInt(a);

    System.out.print("첫번째 수 : ");
    int b = sc.nextInt();

    System.out.print("두번째 수 : ");
    int c = sc.nextInt();

    printBet(b, c);
  }

  public static void printInt(int a){
    for (int b = 0; b <= a; b++){
      System.out.println(b);
    }
  }

  public static void printBet(int a, int b){
    int max = a;
    int min = a;

    if (a > b){
      min = b;
    }

    else {
      max = b;
    }

    //int max = num1 > num2 ? num1 : num2
    //int max = Math.max(num1, num2)

    for (int c = min; c <= max; ++c){
      System.out.println(c);
    }

  }

}
