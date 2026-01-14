import java.util.Arrays;

public class Test2_5 {
  public static void main(String[] args) {
    int[] lotto = new int[6];

    for (int i = 0; i < lotto.length; ++i){
      lotto[i] = (int)(Math.random() * 45 + 1);
      System.out.println((i + 1)+"번째 번호 : " + lotto[i]);
    }
      //로또 번호 출력
    Arrays.toString(lotto);
    System.out.println(Arrays.toString(lotto));

  }
}
