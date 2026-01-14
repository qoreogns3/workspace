public class Student {

String name;
int age;
String addr;
int grade;
String phoneNumber;

public void initStudent(String name, int age, String addr, int grade, String phoneNumber){

  this.name = name;
  this.age = age;
  this.addr = addr;
  this.grade = grade;
  this.phoneNumber = phoneNumber;
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

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void printAllData(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " +  age);
    System.out.println("주소 : " + addr);
    System.out.println("학번 : " + grade + "학번");
    System.out.println("연락처 : " + phoneNumber);
  }
}
