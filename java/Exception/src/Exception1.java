import java.util.Scanner;

//예외처리 > 오류처리
/*
예외처리 문법
try{
  예외가 발생할수 있는 코드 작성
  ...
  1.첫번째 줄
  2.두번째 줄
  3.세번째 줄
} catch(Exception e){
  예외 발생 시 실행할 코드
}
 */
public class Exception1 {
  public static void main(String[] args) {
    //예외가 발생하는 즉시 프로그램 종료
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("첫번째 수 : ");
      int a = sc.nextInt();
      System.out.print("두번째 수 : ");
      int b = sc.nextInt();

      System.out.println("a / b = " + a / b);
    }catch (Exception e){
      //e.getMessage() : 예외 발생 이유를 문자열로 리턴
      System.out.println(e.getMessage());
      System.out.println(e.printStackTrace());;
    }


    System.out.println("프로그램 종료");
  }
}
