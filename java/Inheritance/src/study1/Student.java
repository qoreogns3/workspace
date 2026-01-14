package study1;

public class Student extends Person{

  int stuNum;
  String major;

  public Student(){
    System.out.println("기본 생성자 호출");
    stuNum = 0;
    major = "";
  }

  //상속관계에 있는 클래스의 생성자의 첫 줄에는
  //부모클래스의 생성자를 호출하는 super()가 숨겨져있음
  //단 this() 명령어로 해당 클래스의 생성자를 호출하는 문법이 있다면
  //super() 명령어는 실행되지 않는다.
  public Student(int stuNum){
    this.stuNum = stuNum;
  }

  public Student(int stuNum, String major){
    this(stuNum);
    this.stuNum = stuNum;
  }
  public void aaa(){
    System.out.println(name);
    System.out.println(super.name);
    System.out.println(this.name);
    tellName();
    super.tellName();
    this.tellName();
  }
}
