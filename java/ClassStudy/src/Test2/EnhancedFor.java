package Test2;

public class EnhancedFor {
  public static void main(String[] args) {

    //for문의 다양 형태 : 향상된 for문(Enhanced-for)
    //혹은 for-each문 이라고 함
    int[] arr1 = {1,3,5,7,9};

    //for(하나씩 뺀 데이터를 지칭할 변수 : 반복할 데이터)
    for(int e : arr1){
      System.out.println(e);
    }

    String[] arr2 = {"A","B","C"};
    for(String e : arr2){
      System.out.println(e);
    }
    System.out.println();

    double[] arr3 = {1.1, 2.2, 3.3};

    //문제1. arr3 배열의 요소 중 2.0 이상의 요소만 출력, for-each문 활용

    for (double e : arr3){
      if (e >= 2.0){
        System.out.println(e);
      }
    }
  }
}
