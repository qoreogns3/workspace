package test2_;

public class WorkInfo {
  private String companyName;
  private String sector;
  private int money;

  public WorkInfo() {
  }

  public WorkInfo(String companyName, String sector, int money) {
    this.companyName = companyName;
    this.sector = sector;
    this.money = money;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
}
