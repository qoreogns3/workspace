public class Man {
  String name;
  int age;
  String addr;

  //this.name -> 이 클래스에 정의된 네임
  //this 키워드는 멤버변수 및 메서드에 사용 가능
  public void initMan(String name, int age, String addr){
    this.name = name;
    this.age = age;
    this.addr = addr;
  }
//    //setter : 클래스가 가진 각각의 멤버변수 값을 변경하는 메서드
//    //        + 메서드명은 반드시 'set멤버변수명' 으로 지정해줘야 함
//    //        + 매개변수 이름을 보통 멤버변수와 동일하게 하고 this 키워드 활용
//  public void setName(String name){
//    this.name = name;
//  }
//
//  public void setAge(int age){
//    this.age = age;
//  }
//
//  public void setAdd(String addr){
//    this.addr = addr;
//  }
//
//    //getter : 클래스의 각각의 멤버변수 값을 리턴하는 메서드
//    //        + 메서드명은 반드시 'get멤버변수명' 으로 지정해줘야 함
//  public String getName(){
//    return name;
//  }
//
//  public int getAge(){
//    return age;
//  }
//
//  public String getAddr(){
//    return addr;
//  }

  //alt + insert : 생성
  //getter와 setter 자동완성기능
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


  public void printAllData(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + addr);
  }

}
