import java.util.Arrays;

public class Test3_10 {

  //10. 매개변수로 두 정수를 받아, 두 정수의 값을 스위칭하는 메소드를 만들고 호출해보세요.
  public static void main(String[] args) {
//    int a = 1;
//    int b = 2;
//    test3_10(a, b);
//    System.out.println(a);
//    System.out.println(b);
    test3_10(1,2);
  }

  public static void test3_10(int a, int b){
    int c = a;
    a = b;
    b = c;

  }
}
