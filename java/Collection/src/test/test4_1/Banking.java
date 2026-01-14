package test.test4_1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banking {

  private List<CustomerInfo> customerInfoList;

  Scanner sc = new Scanner(System.in);

  public Banking() {
    customerInfoList = new ArrayList<>();
  }

  public List<CustomerInfo> getCustomerInfoList() {
    return customerInfoList;
  }

  public void setCustomerInfoList(List<CustomerInfo> customerInfoList) {
    this.customerInfoList = customerInfoList;
  }

  public void openAcoount(){
    System.out.println("계좌개설을 시작합니다.");
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("주민등록번호 : ");
    int registerNumber = sc.nextInt();
    System.out.print("연락처 : ");
    String phoneNumber = sc.next();
    System.out.print("계좌번호 : ");
    int accountNumber = sc.nextInt();

    AccountInfo accountInfo = new AccountInfo(registerNumber, accountNumber, 10000);
    CustomerInfo customerInfo = new CustomerInfo(name, registerNumber, phoneNumber, accountInfo);
    customerInfoList.add(customerInfo);
  }

  public void deposit(){
    System.out.print("입금계좌번호 : ");
    int accountNumber = sc.nextInt();
    int chk = 0;
    for (CustomerInfo customerInfo : customerInfoList){
      if (customerInfo.getAccountInfo().getAccountNumber() == accountNumber){
        System.out.print("현재 총 예금액은 " + customerInfo.getAccountInfo().getCredit() + "원입니다. 예금액을 입력하세요 : ");
        int money = sc.nextInt();
        customerInfo.getAccountInfo().setCredit(customerInfo.getAccountInfo().getCredit() + money);
        System.out.println("정상 입금되었습니다. 현재 총 예금액은 " + customerInfo.getAccountInfo().getCredit() +"원입니다.");
        chk++;
      }
    }
    if (chk == 0){
      System.out.println("일치하는 계좌가 없습니다.");
    }
  }

  public void withdrawal(){
    System.out.print("출금계좌번호 : ");
    int accountNumber = sc.nextInt();
    int chk = 0;
    for (CustomerInfo customerInfo : customerInfoList){
      if (customerInfo.getAccountInfo().getAccountNumber() == accountNumber){
        System.out.print("현재 총 예금액은 " + customerInfo.getAccountInfo().getCredit() + "원입니다. 예금액을 입력하세요 : ");
        int money = sc.nextInt();
        customerInfo.getAccountInfo().setCredit(customerInfo.getAccountInfo().getCredit() - money);
        System.out.println("정상 출금되었습니다. 현재 총 예금액은 " + customerInfo.getAccountInfo().getCredit() +"원입니다.");
        chk++;
      }
    }
    if (chk == 0){
      System.out.println("일치하는 계좌가 없습니다.");
    }
  }

  public void depositInquiry(){
    System.out.print("계좌번호 : ");
    int accountNumber = sc.nextInt();
    int chk = 0;
    for (CustomerInfo customerInfo : customerInfoList){
      if (customerInfo.getAccountInfo().getAccountNumber() == accountNumber){
        System.out.print("현재 총 예금액은 " + customerInfo.getAccountInfo().getCredit() + "원입니다.");
        chk++;
      }
    }
    if (chk == 0){
      System.out.println("일치하는 계좌가 없습니다.");
    }
  }

  public void accountCancel(){
    System.out.print("해지계좌번호 : ");
    int accountNumber = sc.nextInt();
    int chk = 0;
    for (int i = 0; i < customerInfoList.size(); i++){
      if (accountNumber == customerInfoList.get(i).getAccountInfo().getAccountNumber()){
        customerInfoList.remove(i);
      }
      chk++;
    }
    if (chk == 0){
      System.out.println("일치하는 계좌가 없습니다.");
    }
  }

  public void viewAll(){
    for (CustomerInfo customerInfo : customerInfoList){
      System.out.println(customerInfo.toString());
    }
  }

}
