public class Machine {
  int num1;
  int num2;
  String operator;

  public void cal (int num1, int num2, String operator) {
    this.num1 = num1;

    this.num2 = num2;

    this.operator = operator;

    switch (this.operator){
      case ("+"):
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        break;

      case ("-"):
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        break;

      case ("*"):
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        break;

      case ("/"):
        System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
        break;

      default:
        System.out.println("잘못된 연산자 입니다.");
        break;
      }


    }

  //메서드의 return 키워드의 활용방법.
  //1. 결과 데이터를 전달하기위해,
  //2. 특정 조건에서 메서드를 중지 시킬때.

  //매개변수로 전달된 데이터가 짝수일때만 출력
  public void printEven(int num){

    if (num1 % 2 != 0){
      return;
    }

    System.out.println(num1);
  }
}
