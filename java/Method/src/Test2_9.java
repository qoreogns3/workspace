public class Test2_9 {
  public static void main(String[] args) {
    int a = 11;
    System.out.println(test2_9(a));
  }

  public static int test2_9(int a){

    int sum = 0;

    for (int i = 1; i < a + 1; i++){
      if (i % 2 == 1){
        sum += i;
      }
    }
    return sum;
  }
}
