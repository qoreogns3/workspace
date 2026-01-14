public class Test2_4 {
  public static void main(String[] args) {

    //Mate.random() -> 0.0에서 0.9999까지의 랜덤한 실수를 반환
    double d = Math.random();
    System.out.println(d);

    //위 Math.random()을 이용하여 1~10까지의 랜덤한 정수를 생성
    // 0.0 <= x < 1.0 실수
    int a =(int)(Math.random() * 10 + 1);
    System.out.println(a);

    //50 <= I < 100

    int I = (int)(Math.random()*50 + 50);
    System.out.println(I);
  }
}
