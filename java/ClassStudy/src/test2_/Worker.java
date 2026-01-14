package test2_;

public class Worker {
  private PersonInfo p = new PersonInfo();
  private WorkInfo w = new WorkInfo();

  public void setInfo(String name, int age, String addr){
    p.setAll(name, age, addr);
  }

  public void setWorkInfo(String companyName, String sector, int money){
    w.setCompanyName(companyName);
    w.setSector(sector);
    w.setMoney(money);
  }

  public void displayWorker(){
    System.out.println("이름 : " + p.getName());
    System.out.println("나이 : " + p.getAge());
    System.out.println("주소 : " + p.getAddr());
    System.out.println("회사명 : " + w.getCompanyName());
    System.out.println("부서 : " + w.getSector());
    System.out.println("급여 : " + w.getMoney());
  }

}
