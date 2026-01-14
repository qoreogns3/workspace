package test1_5;

public class MemberService {


  public boolean login(String id, String pw){
    return id.equals("hong") && pw.equals("12345");
  }

  public void logout(String id){
    System.out.println("로그아웃 되었습니다.");
  }
}
