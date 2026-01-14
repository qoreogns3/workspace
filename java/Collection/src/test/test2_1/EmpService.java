package test.test2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
  Scanner sc = new Scanner(System.in);


  private List<Emp> empList;

  public EmpService(){
    empList = new ArrayList<>();

    Emp member1 = new Emp(1001, "kim", "개발부", "010-0000-0000", 10000);
    Emp member2 = new Emp(1002, "lee", "인사부", "010-1111-1111", 20000);
    Emp member3 = new Emp(1003, "park", "홍보부", "010-2222-2222", 30000);
    Emp member4 = new Emp(1004, "baek", "개발부", "010-3333-3333", 40000);
    Emp member5 = new Emp(1005, "choi", "개발부", "010-4444-4444", 50000);

    empList.add(member1);
    empList.add(member2);
    empList.add(member3);
    empList.add(member4);
    empList.add(member5);

  }

  public void login(){

    while (true){
      System.out.print("사번 : ");
      int num1 = sc.nextInt();

      System.out.print("비밀번호(연락처의 마지막 4자리) : ");
      String num2 = sc.next();

      int check = -1;

      for (int i = 0; i < empList.size(); i++) {
        if (num1 == empList.get(i).getCompanyNum() && num2.equals(empList.get(i).getPhoneNumber().substring(9))) {
          check = i;
        }
      }

      if (check == -1){
        System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
        continue;
      }

      if (check != -1){
        System.out.println("로그인 하였습니다.");
        System.out.println("'" + empList.get(check).getName() + "'님 반갑습니다.");
        break;
      }
    }
  }

  public void salaryOut(){
    System.out.print("부서명 : ");
    String dep = sc.next();
    System.out.println("==개발부 월급 현황==");

    int sum = 0;
    int num = 0;
    for (Emp emp : empList){
      if (dep.equals(emp.getDepName())){
        System.out.println("이름 : " + emp.getName() + ",  월급 : " + emp.getSalary());
        sum = sum + emp.getSalary();
        num++;
      }
    }
    System.out.println("개발부서의 월급 총액은 " + sum + "원이며, 평균 급여는 " + sum/num +"원입니다.");
  }

  public void salaryUp(){
    System.out.print("부서명 : ");
    String dep = sc.next();
    System.out.print("인상급여 : ");
    int up = sc.nextInt();

    System.out.println("개발부 각 사원의 급여가 각각 " + up +"원씩 인상됩니다.");
    System.out.println("==월급 인상 후 개발부 월급 현황==");

    for (Emp emp : empList){
      if (dep.equals(emp.getDepName())){
        System.out.println("이름 : " + emp.getName() + ",  월급 : " + (emp.getSalary() + up));
      }
    }

  }


}




