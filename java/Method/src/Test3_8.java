import java.util.Arrays;

public class Test3_8 {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3};
    int[] arr2 = {1,2};

    int[] arr =test3_8(arr1, arr2);

    System.out.println(Arrays.toString(arr));
  }

  public static int[] test3_8(int[] arr1,int[] arr2){
    int[] arr = new int[arr1.length+arr2.length];

    for (int i = 0; i < arr1.length + arr2.length; i++){
      if (i < arr1.length){
        arr[i] = arr1[i];
      }

      else {
        arr[i] = arr2[i - arr1.length];
      }
    }

    return arr;

  }
}
