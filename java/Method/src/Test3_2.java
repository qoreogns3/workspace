public class Test3_2 {
  public static void main(String[] args) {
    test3_2(5);

  }

  public static void test3_2(int a){
    for (int i = 1; a*i < 101; i++){
      System.out.println(a*i);
    }
  }
}
