import java.util.Arrays;

public class Test3_9 {

  //9. 정수형 배열 하나를 매개변수로 받아 배열의 요소 중 홀수를 제거한 새로운 배열을 리턴하는 메
  //소드를 만들어보세요.
  public static void main(String[] args) {
    int[] arr1 = {1,3,4,5,7,2};
    int[] arr = test3_9(arr1);

    System.out.println(Arrays.toString(arr));
  }

  public static int[] test3_9(int[] arr1){
    //배열 크기는 변경 불가 !!

    //1. 매개변수로 들어온 배열 요소에서 짝수의 갯수를 구함

    int cnt = 0;
    for (int i = 0; i < arr1.length; i++){
      if (arr1[i] % 2 == 0){
        cnt++;
      }
    }

    //답을 저장할 배열 생성

    int[] arr = new int[cnt];
    int a = 0;

    //매개변수로 전달된 배열 요소 중 짝수만 결과 배열에 저장

    for (int i = 0; i < arr1.length; i++){
      if (arr1[i] % 2 == 0){
        arr[a++] = arr1[i];
      }
    }
    return arr;
  }

}
