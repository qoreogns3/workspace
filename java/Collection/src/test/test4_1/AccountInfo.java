package test.test4_1;

public class AccountInfo {
  private int registerNumber;
  private int accountNumber;
  private int credit;

  public AccountInfo(int registerNumber, int accountNumber, int credit) {
    this.registerNumber = registerNumber;
    this.accountNumber = accountNumber;
    this.credit = credit;
  }

  public int getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(int registerNumber) {
    this.registerNumber = registerNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getCredit() {
    return credit;
  }

  public void setCredit(int credit) {
    this.credit = credit;
  }
}
