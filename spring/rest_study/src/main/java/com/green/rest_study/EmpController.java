package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/emps")
public class EmpController {
  private List<Emp> empList;

  public EmpController(){
    empList = new ArrayList<>();

    empList.add(new Emp(1, "kim", "a", 10000, "사원"));
    empList.add(new Emp(2, "lee", "a", 20000, "대리"));
    empList.add(new Emp(3, "park", "b", 10000, "사원"));
    empList.add(new Emp(4, "kang", "b", 20000, "대리"));
    empList.add(new Emp(5, "baek", "b", 30000, "부장"));
  }

  @GetMapping("")
  public List<Emp> getEmpList(){
    System.out.println("전체 사원 조회");
    return empList;
  }

  @GetMapping("/{num}")
  public Emp getEmp(@PathVariable("num") int num){
    System.out.println(num + "번 사원 조회");
    Emp result = null;
    for (Emp emp : empList){
      if (num == emp.getCompanyNum()){
        result = emp;
      }
    }
    return result;
  }

  @PostMapping("")
  public void postEmp(@RequestBody Emp emp){
    System.out.println("사원 등록");
    empList.add(emp);
  }

  @DeleteMapping("/{num}")
  public String deleteEmp(@PathVariable("num") int num){
    System.out.println(num + "번 사원 삭제");
    for (int i = 0; i < empList.size(); i++){
      if (num == empList.get(i).getCompanyNum()){
        empList.remove(i);
        break;
      }
    }
    return "삭제 완료";
  }

  @PutMapping("/{num}")
  public String updateEmp(@RequestBody Emp emp, @PathVariable("num") int num){
    System.out.println(num + "번 사원 수정");
    for (Emp emp1 : empList){
      if (emp1.getCompanyNum() == num){
        emp1.setSalary((emp.getSalary()));
        emp1.setDptName(emp.getDptName());
      }
    }
    return "수정 완료";
  }
}
