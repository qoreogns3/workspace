package test1234;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 = ");
        int num = sc.nextInt();

        int a = num / 100;
        int b = (num - a*100) / 10;
        int c = (num - a*100 - b*10);

        int cnt =  0;

        if (a != 0 && a % 3 == 0){
            cnt++;
        }

        if (b != 0 && b % 3 == 0){
            cnt++;
        }

        if (c != 0 && c % 3 == 0){
            cnt++;
        }

        System.out.println("박수" + cnt + "번");


    }
}
