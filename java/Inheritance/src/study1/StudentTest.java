package study1;

public class StudentTest {
  public static void main(String[] args) {

    Student s1 = new Student();
    System.out.println();
    Student s2 = new Student(1);

    //private : 멤버변수 및 메서드를 선언한 클래스 안에서만 접근 가능
    //protected : 상속받은 클래스 안에서도 접근 가능
    //default : 패키지 안
    //public : 프로젝트 안
  }
}
