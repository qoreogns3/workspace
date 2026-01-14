package study1.a;

public class A {
  private int x;
  private int y;


  public A() {
    this.x = 1;
    this.y = 1;
  }

  public A(int a) {
    this.x = a;
    this.y = 1;
  }

  public A(int a, int b) {
    this.x = a;
    this.y = b;
  }

  public A(int a, int b, int c){
    this.x = a;
    this.y = b;
  }

  public A(int a, int b, int c, int d){
    this.x = a;
    this.y = b;
  }

  public void bp(){
    System.out.print("x = " + this.x + ", ");
    System.out.print("y = " + this.y + ", ");
  }


}
