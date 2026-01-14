public class Test3_6 {
  public static void main(String[] args) {

    int[] arr = {3,4,6,2,-3};
    int a = test3_6(arr);
    System.out.println(a);
  }

  public static int test3_6(int[] arr){
    int max = arr[0];
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max){
        max = arr[i];
      }
    }

    return max;
  }
}
