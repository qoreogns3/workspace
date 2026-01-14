import java.util.Scanner;

public class Test1_14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : ");
    int b = sc.nextInt();

    System.out.print("두번째 수 : ");
    int c = sc.nextInt();

    printBet(b, c);

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

    int cnt = 0;

    for (int c = min; c <= max; c++){
      if (c % 5 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
