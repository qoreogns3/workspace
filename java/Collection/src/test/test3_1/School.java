package test.test3_1;

import java.util.ArrayList;
import java.util.List;

public class School {
  private List<StudyClass> school;

  public School() {

  }

  public School(List<StudyClass> school) {
    this.school = school;
  }

  public void classStudentInfo(String name){
    for (StudyClass studyClass1 : school){
      if (name.equals(studyClass1.getTeacher())){
        studyClass1.classStudents();
      }
    }
  }

  public void scoreInfo(){
    double sum = 0;
    for (StudyClass studyClass1 : school){
      System.out.println(studyClass1.getClassName() + " 평균 : " + studyClass1.avgScore());
      sum = sum + studyClass1.avgScore();
    }

    System.out.println("전체 학급에 대한 평균 : " + sum / school.size());
  }

  public void bestScoreStudents(){
    for (StudyClass studyClass1 : school){
      System.out.println("최고 성적을 가진 학생 : " + studyClass1.bestScoreStudent().getName());
      System.out.println("점수 : " + studyClass1.bestScoreStudent().getScore());
    }
  }

  public double classAvg(String name){
    StudyClass sc1 = new StudyClass();
    for (StudyClass studyClass1 : school){
      if (name.equals(studyClass1.getClassName())){
        sc1 = studyClass1;
      }
    }
    return sc1.avgScore();
  }
}



