import java.util.Scanner;

public class Test1_15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 입력 : ");
    String a = sc.nextLine();
    System.out.print("숫자 입력 : ");
    int b = sc.nextInt();

    printCnt(a,b);



  }

  public static void printCnt(String a, int b){
    for (int c = 0; c < b; c++){
      System.out.println(a);
    }
  }
}
