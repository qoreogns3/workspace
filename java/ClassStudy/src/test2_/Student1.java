package test2_;

public class Student1 {
  Sungjuk s = new Sungjuk();
  PersonInfo p = new PersonInfo();

  public void setInfo(String name, int age, String addr){
    p.setAll(name, age, addr);
  }

  public void setSungjuk(int korScore, int engScore, int mathScore){
    s.setSungjuk(korScore, engScore, mathScore);
  }

  public void displayStudentInfo(){
    System.out.println("이름 : " + p.getName());
    System.out.println("나이 : " + p.getAge());
    System.out.println("주소 : " + p.getAddr());
    System.out.println("국어점수 : " + s.getKorScore());
    System.out.println("영어점수 : " + s.getEngScore());
    System.out.println("수학점수 : " + s.getMathScore());
    System.out.println("총점 : " + s.getAllScore());
    System.out.println("평균 : " + s.getAvr());
  }
}
