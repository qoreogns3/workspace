public class Method_1 {
  //이름과 나이를 출력
  public static void printNameAndAge(){
    System.out.println("이름은 홍길동입니다.");
    System.out.println("나이는 20살입니다");
  }

  //메인 메서드를 정의
  public static void main(String[] args) {
    System.out.println("시작");
    printHello();
    printNameAndAge();
    System.out.println("종료");
  }

  //"안녕" 문자열을 출력하는 기능을 가진 메서드를 정의
  public static void printHello(){
    System.out.println("안녕");
  }



}
