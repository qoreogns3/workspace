import java.util.Random;

public class Test3_3 {
  public static void main(String[] args) {
    int a = test3_3();
    System.out.println(a);
  }

  public static int test3_3(){
    int a = (int)(Math.random() * 50 + 1);
    return a;
  }
}
