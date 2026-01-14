public class Test2_7 {
  public static void main(String[] args) {
    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++){
      arr[i] = (int)(Math.random()*100 + 1);
    }

    int max = 0;
    int min = 100;

    for (int i = 0; i < arr.length; i++){
      if (max < arr[i]){
        max = arr[i];
      }
      if (min > arr[i]){
        min = arr[i];
      }
    }
    System.out.println(max);
    System.out.println(min);
  }
}
