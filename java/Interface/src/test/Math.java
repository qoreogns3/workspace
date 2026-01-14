package test;

public class Math implements MathUtil{


  @Override
  public boolean isEven(int a, int b, int c) {
    if ((a + b + c)%2 == 0 && (a + b + c)%5 == 0){
      return true;
    }
    else return false;
  }

  @Override
  public double getSumFromOne(int num) {

    double sum = 0;

    for (int i = 1; i < num + 1; i ++){
      sum = sum + i;
    }
    return sum;
  }

  @Override
  public double getCircleArea(int rad) {
    if (rad >= 0 ){
      return rad * rad * java.lang.Math.PI;
    }
    else {
      return 0;
    }
  }
}
