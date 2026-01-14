public class Test3_7 {
  public static void main(String[] args) {
    String[] arr = {"abc","def","ghi"};
    System.out.println(test3_7(arr));
  }

  public static String test3_7(String[] arr){
    String a = "" ;
    for (int i = 0; i < arr.length; i++){
      a = a + arr[i];
    }
    return a;
  }
}
