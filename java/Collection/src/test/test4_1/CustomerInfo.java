package test.test4_1;

public class CustomerInfo {
  private String name;
  private int registerNumber;
  private String phoneNumber;
  private AccountInfo accountInfo;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(int registerNumber) {
    this.registerNumber = registerNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AccountInfo getAccountInfo() {
    return accountInfo;
  }

  public void setAccountInfo(AccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }

  public CustomerInfo(String name, int registNumber, String phoneNumber, AccountInfo accountInfo) {
    this.name = name;
    this.registerNumber = registNumber;
    this.phoneNumber = phoneNumber;
    this.accountInfo = accountInfo;
  }

  @Override
  public String toString() {
    return "이름 = " + name +
            "  주번 = " + registerNumber +
            "  연락처 = " + phoneNumber +
            "  계죄번호 = " + accountInfo.getAccountNumber() +
            "  예금액 = " + accountInfo.getCredit();
  }
}
