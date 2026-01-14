package test1_7;

public class Mul {
  private int a;
  private int b;

  public void setValue(int a, int b){
    this.a = a;
    this.b = b;
  }

  public int calculate(){
    System.out.print(a + " * " + b + " = " + (a*b));
    return a*b;
  }
}
