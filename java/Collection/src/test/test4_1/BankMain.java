package test.test4_1;

import java.util.Scanner;

public class BankMain {



  public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    Banking banking = new Banking();

    while (true){
      System.out.print("1. 계좌개설  2.입금  3.출금  4.예금조회  5.계좌해지  6.전체조회  =>  ");
      int num = sc.nextInt();
      if (num == 1){
        banking.openAcoount();
        System.out.println(" ");
      }
      else if (num == 2){
        banking.deposit();
        System.out.println(" ");
      }
      else if (num == 3){
        banking.withdrawal();
        System.out.println(" ");
      }
      else if (num == 4){
        banking.depositInquiry();
        System.out.println(" ");
      }
      else if (num == 5){
        banking.accountCancel();
        System.out.println(" ");
      }
      else if (num == 6){
        banking.viewAll();
        System.out.println(" ");
      }
    }
  }

}
