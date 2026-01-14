import java.util.Scanner;

public class Test1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

    //배열의 크기만큼 키보드로 입력받아 저장
    for (int i = 0 ; i < arr.length; i++){
      System.out.print(i + " 요소 입력 : ");
      arr[i] = sc.nextInt();
    }

    //배열 요소 확인
    System.out.println("=== 배열의 모든 요소 ===");
    for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }


  }
}
