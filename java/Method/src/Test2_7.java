import java.math.BigDecimal;

public class Test2_7 {
  public static void main(String[] args) {

    double a = 1.1;
    System.out.println(test2_7(a));

    System.out.println(1.1 * 1.1);

    //
    BigDecimal aa = new BigDecimal("1.1");
    System.out.println(aa.multiply(aa));
  }



  public static double test2_7(double a){
    return a*a;
  }
}
