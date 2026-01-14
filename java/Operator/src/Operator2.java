public class Operator2 {
  public static void main(String[] args) {
    //증감연산자
    int num1 = 5;
    num1++;
    System.out.println(num1);
    --num1;
    System.out.println(num1);

    int num2 = 5;
    int num3 = ++num2;
    System.out.println(num3);

    int num4 = num3++;
    System.out.println(num4);
    System.out.println(num3);

    //복합대입연산자
    int a = 3;
    int b = 7;
//    a = a+b;
    a += b;

    a += 1; // a = a+1;
    a /= 3; // a = a/3;
    a *= b; // a = a*b;

    int score = 90;

    //score 값을 1증가 시키는 코드
    ++score;
    score++;
    score += 1;
    score = score + 1;

   int q = 10;
   int w = 3;
    System.out.println("result = " + (double)q / (double)w);
  }
}
