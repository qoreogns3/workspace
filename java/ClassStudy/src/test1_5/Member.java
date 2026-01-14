package test1_5;

public class Member {
  private String name;
  private String id;
  private String pw;
  private int age;

  public Member() {
  }

  public Member(String name, String id, String pw, int age){
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }



  public Member(String name, String id){
    this.name = name;
    this.id = id;
  }

  Member user1 = new Member("홍길동", "hong");
  Member user2 = new Member("김자바", "java");

}
