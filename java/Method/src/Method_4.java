public class Method_4 {
  public static void main(String[] args) {
    printSum(3,4);
    printInfo("홍길동",20);
  }

  //매개변수로 전달된 이름과 나이를 출력하는 메서드
  public static void printInfo(String name, int age){
    System.out.println(name);
    System.out.println(age);
  }

  //매개변수로 들어운 두 정수의 합을 출력하는 메서드
  public static void printSum(int a, int b){
    System.out.println(a + b);
  }
}
