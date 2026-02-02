package test1234;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
