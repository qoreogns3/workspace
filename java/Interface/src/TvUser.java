public class TvUser {
  public static void main(String[] args) {

    //인터페이스를 구현한 클래스의 객체를
    //해당 인터페이스 자료형으로 받을 수 있음
    Tv tv = new LgTV();
    tv.turnOn();
    tv.volumeUp();
    tv.volumeDown();
    tv.turnOff();

    Tv tv1 = new SamsungTV();
    SamsungTV tv2 = new SamsungTV();

    SamsungTV[] tvs = new SamsungTV[5];
    tvs[0] = new SamsungTV();
//    tvs[1] = new LgTV();

    Tv[] tt = new Tv[5];
    tt[0] = new SamsungTV();
    tt[1] = new LgTV();



  }
}
