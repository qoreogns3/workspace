package Test2;

public class ArrayTest {
  public static void main(String[] args) {

    Acc[] arr = new Acc[3];

    Acc a1 = new Acc("kim", "1111", 10000);
    Acc a2 = new Acc("kim1", "1112", 20000);
    Acc a3 = new Acc("kim2", "1113", 30000);

    arr[0] = a1;
    arr[1] = a2;
    arr[2] = a3;


    //문제3. 배열에 저장 된 모든 계좌의 예ㅇ금액 합을 출력
//    int sum = 0 ;
//    for(int i = 0; i < arr.length ; i++){
//      sum = sum + arr[i].getBalance();
//
//    int sum = 0;
//    for (Acc e : arr){
//      sum = sum + e.getBalance();
//    }

//    }

    //문제4. 배열에 저장된 계좌정보 중 계좌번호가 "2222"인 계좌를 찾고,
    //해당 계좌의 계좌주를 출력

//    for (int i = 0; i < arr.length; i++){
//      if (arr[i].getAccNumber().equal("2222")){
//        System.out.println(arr[i].getOwner());

    for (Acc e : arr){
      if(e.getAccNumber().equals("1112")){
        System.out.println(e.getOwner());
      }

    }



      }
    }



