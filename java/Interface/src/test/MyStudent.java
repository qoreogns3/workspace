package test;

public class MyStudent implements StudentUtil {



  @Override
  public int getTotalScore(Student a) {
    return a.getEngScore() + a.getKorScore() + a.getMathScore();
  }

  @Override
  public Student getHighScoreStudent(Student a, Student b) {
    return getTotalScore(a) > getTotalScore(b) ? a : b;
  }

  @Override
  public String getGradeByStudentName(Student[] a, String name) {

    Student st = new Student();

    for (int i = 0; i < a.length; i++){
      if (name.equals(a[i].getName())){
        st = a[i];
        break;
      }
    }

    double avr = (double) (getTotalScore(st)) / 3;

    if (90 <= avr && avr <= 100) {
      return "A";
    } else if (80 <= avr) {
      return "B";
    } else if (70 <= avr) {
      return "C";
    } else if (avr < 70) {
      return "D";
    } else {
      return "학생 정보 없음";
    }
  }


  @Override
  public int[] getTotalScoresToArray(Student[] a) {
    int[] sum = new int[a.length];

    for (int i = 0; i < a.length; i++){
      sum[i] = a[i].getMathScore() + a[i].getKorScore() + a[i].getEngScore();
    }

    return sum;
  }

}
