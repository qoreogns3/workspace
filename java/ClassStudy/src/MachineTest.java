import java.util.Scanner;

public class MachineTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Machine a1 = new Machine();

    System.out.print("첫 번째 수 : ");
    int a = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int b = sc.nextInt();
    System.out.print("연산자입력(+, -, *, /) : ");
    String c = sc.next();

    a1.cal(a, b, c);


  }
}
