package test;

public class Member {
  private String id;
  private String password;
  private String name;
  private int age;

  public void serInfo(String id, String password, String name, int age){
    this.id = id;
    this.password = password;
    this.name = name;
    this.age = age;
  }

  public void showInfo(){
    System.out.println("id : " + id);
    System.out.println("password : " + password);
    System.out.println("name : " + name);
    System.out.println("age : " + age);
  }

  public boolean isLogin(String id, String pw){
    if (this.id.equals(id) && this.password.equals(pw)){
      System.out.println("로그인 가능");
      return true;
    }
    else {
      System.out.println("로그인 불가능");
      return false;
    }

  }
}
