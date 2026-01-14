public class Member {
  String name;
  String id;
  String password;
  int age;


  public void setMemberInfo(String name1, String id1, String password1, int age1){
    name = name1;
    id = id1;
    password = password1;
    age = age1;
  }

  public void printAllData(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("패스워드 : " + password);
    System.out.println("나이 : " + age);
  }
}

