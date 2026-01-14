public class Test2_8 {
  public static void main(String[] args) {
    int[] arr = new int[100];

    for (int i = 0; i < arr.length; i++){
      arr[i] = i + 1;
    }

    for (int i = 0; i < arr.length; i++){
      if(i + 1 == 1){
        continue;
      }

      if (i + 1 == 2){
        System.out.println(arr[i]);
      }

      if ((i + 1)%2 == 0){
        continue;
      }

      if (i + 1 == 3){
        System.out.println(arr[i]);
      }

      if ((i + 1)%3 == 0){
        continue;
      }

      if (i + 1 == 5){
        System.out.println(arr[i]);
      }

      if ((i + 1)%5 == 0){
        continue;
      }

      if (i + 1 == 7){
        System.out.println(arr[i]);
      }

      if ((i + 1)%7 == 0){
        continue;
      }

      System.out.println(arr[i]);

    }
  }
}
