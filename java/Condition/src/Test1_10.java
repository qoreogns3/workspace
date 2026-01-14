import java.util.Scanner;

public class Test1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : ");
    int num1 = sc.nextInt();

    System.out.print("두번째 수 : ");
    int num2 = sc.nextInt();

    System.out.print("세번째 수 : ");
    int num3 = sc.nextInt();

    if (num1 > num2 && num2 > num3){
      System.out.println(num1 + " > " + num2 + " > " + num3);
    }
    else if (num1 > num3 && num3 > num2){
      System.out.println(num1 + " > " + num3 + " > " + num2);
    }
    else if (num2 > num1 && num1 > num3){
      System.out.println(num2 + " > " + num1 + " > " + num3);
    }
    else if (num2 > num3 && num3 > num1){
      System.out.println(num2 + " > " + num3 + " > " + num1);
    }
    else if (num3 > num1 && num1 > num2){
      System.out.println(num3 + " > " + num1 + " > " + num2);
    }
    else if (num3 > num2 && num2 > num1){
      System.out.println(num3 + " > " + num2 + " > " + num1);
    }
  }
}
