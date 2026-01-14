public class Test1_1 {
  public static void main(String[] args) {
    printHello();
    printInt(3);
    printChar("안녕");
    printSum(3,4);
    printMul(3,4,5);
    printDiv(5,3);
    printList("안녕","대훈");

  }

  public static void printHello(){
    System.out.println("안녕하세요");
  }

  public static void printInt(int a){
    System.out.println(a);
  }

  public static void printChar(String a){
    System.out.println(a);
  }

  public static void printSum(int a, int b){
    System.out.println(a + b);
  }

  public static void printMul(int a, int b, int c){
    System.out.println(a*b*c);
  }

  public static void printDiv(int a, int b){
    System.out.println("몫 : " + a/b);
    System.out.println("나머지 : " + a%b);
  }

  public static void printList(String a, String b){
    System.out.println(a+b);
  }


}
