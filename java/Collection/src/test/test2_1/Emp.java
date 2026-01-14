package test.test2_1;

public class Emp {
  private int companyNum;
  private String name;
  private String depName;
  private String phoneNumber;
  private int salary;

  public Emp(int companyNum, String name, String depName, String phoneNumber, int salary) {
    this.companyNum = companyNum;
    this.name = name;
    this.depName = depName;
    this.phoneNumber = phoneNumber;
    this.salary = salary;


  }

  public int getCompanyNum() {
    return companyNum;
  }

  public void setCompanyNum(int companyNum) {
    this.companyNum = companyNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "companyNum=" + companyNum +
            ", name='" + name + '\'' +
            ", depName='" + depName + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", salary=" + salary +
            '}';
  }

}
