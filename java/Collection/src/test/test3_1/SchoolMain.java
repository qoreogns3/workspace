package test.test3_1;

import java.util.ArrayList;
import java.util.List;

public class SchoolMain {
  public static void main(String[] args) {

    List<StudyClass> schoolList = new ArrayList<>();

    List<Student> c1 = new ArrayList<>();
    c1.add(new Student("kim1", 15, 100));
    c1.add(new Student("lee1", 15, 80));
    c1.add(new Student("baek1", 15, 70));

    List<Student> c2 = new ArrayList<>();
    c2.add(new Student("kim2", 15, 60));
    c2.add(new Student("lee2", 15, 30));
    c2.add(new Student("baek2", 15, 40));

    List<Student> c3 = new ArrayList<>();
    c3.add(new Student("kim3", 15, 90));
    c3.add(new Student("lee3", 15, 50));
    c3.add(new Student("baek3", 15, 10));

    schoolList.add(new StudyClass(c1, "1반", "kim"));
    schoolList.add(new StudyClass(c2, "2반", "lee"));
    schoolList.add(new StudyClass(c3, "3반", "kim"));

    School school = new School(schoolList);

    school.classStudentInfo("kim");

  }
}
