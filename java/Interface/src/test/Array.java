package test;

public class Array implements ArrayUtil{

  @Override
  public int getArraySum(int[] arr1, int[] arr2) {
    int sum1 = 0;
    int sum2 = 0;

    for(int e : arr1){
      sum1 = sum1 + e;
    }

    for (int e : arr2){
      sum2 = sum2 + e;
    }

    return (sum1 + sum2)/(arr1.length + arr2.length);
  }

  @Override
  public boolean isEvenArray(int[] arr) {
    boolean isAllEven = true;

    //배열의 요소 중 하나라도 홀수를 만나면 isAllEven 변수의 값을 false로 변경

    for (int e : arr){
      if (e % 2 != 0){
        isAllEven = false;
        break;
      }
    }
    return isAllEven;
  }

  @Override
  public int[] getStrLengthArray(String[] arr) {
  int[] resultArr = new int[arr.length];
  for (int i = 0; i < resultArr.length; i++){
    resultArr[i] = arr[i].length();
  }

  return resultArr;
  }
}
