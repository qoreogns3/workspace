//제네딕 클래스의 타입인자 제한
// -> 다양한 메서드를 사용해서 클래스를 구현

//<T extends Phone>
// -> 타입인자로 Phone클래스 그리고 Phone 클래스를 상속한 클래스만!
public class GBox2<T extends Phone> {
  private T t;

  public void method1(){
    t.call();
    t.sendMsg();
  }
}

class Phone{
  public void call(){
    System.out.println("전화 함");

  }

  public void sendMsg(){
    System.out.println("문자 함");
  }
}

class Smartphone extends Phone{
  public void playApp(){
    System.out.println("앱 실행");
  }

}

