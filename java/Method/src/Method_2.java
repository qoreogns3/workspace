public class Method_2 {
  public static void main(String[] args) {
    printLagerNum();
    printArray();
  }

  //배열의 모든 요소를 출력하는 메서드 정의
  public static void printArray(){
    double[] arr = {1.1, 2.2, 3.3};
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }

  //두 수 중 큰 수를 출력하는 메서드 정의
  public static void printLagerNum(){
    int a = 10;
    int b = 20;

    if(a > b){
      System.out.println(a);
    }
    else {
      System.out.println(b);
    }
  }
}
