package Test2;

public class Class {
  private String name;
  private int age;
  private String phoneNumber;
  private String grade;

  public Class(){}

  public Class(String name, int age, String phoneNumber, String grade){
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.grade = grade;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }
}
