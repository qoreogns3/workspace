import java.util.Scanner;

public class 성적 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //문제를 풀기 위한 변수 선언//
    //국어, 영어, 수학, 총점을 저장할 변수//
    int korScore, engScore, mathScore, totalScore;
    double avg; //평균

    //==== 국영수 점수 입력 받기 ====//
    System.out.print("국어점수 : ");
    korScore = sc.nextInt();

    System.out.print("영어점수 : ");
    engScore = sc.nextInt();

    System.out.print("수학점수 : ");
    mathScore = sc.nextInt();

    //총점 및 평균 계산
    totalScore = korScore + engScore + mathScore;
    avg = totalScore / 3.0;
    System.out.println("총점 : "+totalScore);
    System.out.println("평균 : "+avg);








//    int korea = sc.nextInt();
//    int math = sc.nextInt();
//    int eng = sc.nextInt();
//
//    System.out.println("국어점수 : "+korea);
//
//
//    System.out.println("수학점수 : "+math);
//
//
//    System.out.println("영어점수 : "+eng);
//
//    System.out.println("총정 : "+(korea + math + eng));
//    System.out.println("평균 : "+(korea + math + eng)/(double)3);
  }
}
