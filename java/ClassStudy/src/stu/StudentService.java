package stu;

import java.util.Scanner;

public class StudentService {


  //학생 3명이 저장될 공간
  private Student[] students;
  private Scanner sc;
  private int stuCnt;

  public StudentService(){
    students = new Student[3];
    sc = new Scanner(System.in);
    stuCnt = 0;
  }

  //학생등록 메서드
  public void regStudent(){
    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");

    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("나이 : ");
    int age = sc.nextInt();
    System.out.print("연락처 : ");
    String phoneNumber = sc.next();
    System.out.print("학점 : ");
    String grade = sc.next();

    //입력받은 정보를 가진 학생 객체를 생성
    Student s = new Student(name, age, phoneNumber, grade);



    //생성한 객체를 배열에 저장
    students[stuCnt++] = s;

  }
  //학생정보변경(연락처) 메서드
  public void changeStuTel(){
    System.out.println("학생의 연락처를 변경합니다.");

    System.out.println("변경 학생 : ");
    String name = sc.next();

    int matchedIndex = -1;

    for (int i = 0; i < stuCnt; i++){
      matchedIndex = i;
    }

    if (matchedIndex == -1){
      System.out.println("일치하는 학생이 없습니다.");
    }
    else {
      System.out.println("연락처 : ");
      String tel = sc.next();
      students[matchedIndex].setPhoneNumber(tel);
      System.out.println("변경 완료 되었습니다.");
    }

//    int m = -1;
//    String name;
//    while (true){
//      System.out.print("변경학생 : ");
//      name = sc.next();
//      for (int i = 0; i < stuCnt; i++){
//        if (students[i].getName().equals(name)){
//          m = i;
//          }
//        }
//
//        if (m != -1){
//          break;
//        }
//
//        else {
//          System.out.println("다시 입력해주세요.");
//        }
//      }
//
//    System.out.print("연락처 : ");
//    String phoneNumber = sc.next();
//
//    for (int i = 0; i < stuCnt; i++){
//      if (students[i].getName().equals(name)){
//        students[i].setPhoneNumber(phoneNumber);
//        System.out.println("변경 완료 되었습니다.");
//      }
//    }





  }
  //학생정보출력 메서드
  public void printStuInfo(){
    System.out.print("정보를 열람할 학생 : ");
    String name = sc.next();

    int matchedIndex = -1; //이름이 일치하는 학생의 index
    for (int i = 0; i < stuCnt; i++){
      if (students[i].getName().equals(name)){
        matchedIndex = i;
        break;
      }

    }

//    for (Student e : students){
//      if (e != null && name.equals(e.getName())){
//        System.out.println("요청하신 학생의 정보입니다.");
//        System.out.println(e.toString());
//      }

    if (matchedIndex == -1){
      System.out.println("일치하는 학생이 없습니다.");
    }

    else {
      System.out.println("요청하신 학생의 정보입니다.");
      System.out.println(students[matchedIndex]);
    }


  }
  //모든학생정보 출력
  public void printStuInfoAll(){
    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 "+ stuCnt +"명 입니다.");

    for (Student e : students){
      if (e != null){
        System.out.println(e.toString());
      }
    }
//
//    for (int i = 0; i < stuCnt; i++){
//      System.out.println(students[i]);
//    }


  }
}
