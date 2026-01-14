package list_study;

public class Man {
  private String name;
  private int age;

  //모든 멤버변수를 초기화하는 생성자
  //getter, setter
  //toString()


  public Man(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Man{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
