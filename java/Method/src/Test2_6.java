public class Test2_6 {
  public static void main(String[] args) {

    int a = 3;
    System.out.println(test2_6(a));
  }

  public static String test2_6(int a){

    //정수 -> 문자열 Integer.parseInt(6);
    int num = Integer.parseInt("8");
    //문자열 -> 정수 String.valueOf(6); -> "6"
    String b = String.valueOf(6);

    return String.valueOf(a);
  }
}
