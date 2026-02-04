package test;

public class Test2 {
  public static void main(String[] args) {
    int[] a = new int[6];

    for (int i = 0; i < 6; i++){
      a[i] = (int)(Math.random() * 46) + 1;
      System.out.println(i + 1 + "번째 수 : " + a[i]);
    }
  }
}
