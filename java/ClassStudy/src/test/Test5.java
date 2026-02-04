package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int[] arr = new int[3];

    for (int i = 0; i < arr.length; i++){
      arr[i] = (int)(Math.random() * 9 + 1);

      for (int j = 0; j < i; j++){
        if (arr[j] == arr[i]){
          i--;
          break;
        }
      }
    }

    int num = 1;

    while (true){
      int strike = 0;
      int ball = 0;

      System.out.print(num + " >> ");

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if (arr[0] == a) {
        strike++;
      }

      else if (arr[0] == b) {
        ball++;
      }

      else if (arr[0] == c) {
        ball++;
      }

      if (arr[1] == a) {
        ball++;
      }

      else if (arr[1] == b) {
        strike++;
      }

      else if (arr[1] == c) {
        ball++;
      }

      if (arr[2] == a) {
        ball++;
      }

      else if (arr[2] == b) {
        ball++;
      }

      else if (arr[2] == c) {
        strike++;
      }

      System.out.println(strike + "스트라이크 " + ball + "볼");

      if (strike == 3){
        System.out.println(num + "회 만에 정답을 맞췄습니다.");
        break;
      }

      num++;
    }
  }
}

