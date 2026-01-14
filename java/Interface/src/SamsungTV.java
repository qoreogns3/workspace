public class SamsungTV implements Tv{
  String name;

  public void aaa(){

  }

  //tv 전원 on
  public void turnOn(){
    System.out.println("삼성 tv - 전원 켬");
  }

  //tv 전원 off
  public void turnOff(){
    System.out.println("삼성 tv - 전원 끔");
  }

  //볼륨 업
  public void volumeUp(){
    System.out.println("삼성 tv - 소리 올림");
  }

  //볼륨 다운
  public void volumeDown(){
    System.out.println("삼성 tv - 소리 내림");
  }


}
