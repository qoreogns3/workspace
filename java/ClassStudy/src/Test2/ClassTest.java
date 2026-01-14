package Test2;

import java.util.Scanner;

public class ClassTest {
  public static void main(String[] args) {

    Class[] st = new Class[3];


    Scanner sc = new Scanner(System.in);


    System.out.println("학생관리 프로그램을 실행합니다.");
    System.out.print("1)학생등록 2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력 5)프로그램 종료 : ");

    int menu = sc.nextInt();
    if (menu < 1 || menu > 5){
      System.out.println("다시 입력해주시기 바랍니다.");
    }

    int st_number = 0;

    if (menu == 1){

      System.out.print("이름 : ");
      String name1 = sc.next();
      System.out.print("나이 : ");
      int age1 = sc.nextInt();
      System.out.print("연락처 : ");
      String phoneNumber1 = sc.next();
      System.out.print("학점 : ");
      String grade1 = sc.next();

      Class st1 = new Class(name1, age1, phoneNumber1, grade1);

      st[st_number] = st1;
      st_number++;
    }



  }
}
