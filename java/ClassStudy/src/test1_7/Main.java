package test1_7;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Add add = new Add();
    Div div = new Div();
    Mul mul = new Mul();
    Sub sub = new Sub();

    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 수 : ");
    int a = sc.nextInt();

    System.out.print("두 번째 수 : ");
    int b = sc.nextInt();

    System.out.print("연산자 : ");
    String c = sc.next();



    switch (c){
      case ("+") :
        add.setValue(a,b);
        add.calculate();
        break;
      case ("*") :
        mul.setValue(a,b);
        mul.calculate();
        break;
      case ("-") :
        sub.setValue(a,b);
        sub.calculate();
        break;
      case ("/") :
        div.setValue(a,b);
        div.calculate();
        break;
    }

  }
}
