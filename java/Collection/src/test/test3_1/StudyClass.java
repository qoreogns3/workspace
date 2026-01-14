package test.test3_1;


import java.util.List;

public class StudyClass {
  private List<Student> students;
  private String className;
  private String teacher;

  public StudyClass() {
  }

  public StudyClass(List<Student> students, String className, String teacher) {
    this.students = students;
    this.className = className;
    this.teacher = teacher;
  }

  public String getClassName() {
    return className;
  }

  public String getTeacher() {
    return teacher;
  }

  public void classStudents() {
    for (Student student : students){
      System.out.println(student.toString());
    }
  }

  public double avgScore() {
    double sum = 0;
    for (Student student : students){
      sum = sum + student.getScore();
    }
    return sum / students.size();
  }

  public Student bestScoreStudent() {
    Student bestStudent = new Student();

    int num = -1;
    int score = 0;
    for ( int i = 0; i < students.size(); i++ ){
      if (students.get(i).getScore() >= score){
        score = students.get(i).getScore();
        num = i;
      }
    }
    return students.get(num);
  }


}