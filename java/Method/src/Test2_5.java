public class Test2_5 {
  public static void main(String[] args) {

    int a = 88;

    System.out.println(printInt(a));

  }
  public static char printInt(int a){
    char grade;
    if (a >= 90){
      grade = 'A';
    }
    else if (a >= 70){
      grade = 'B';
    }
    else {
      grade = 'C';
    }
    return grade;
  }
}
