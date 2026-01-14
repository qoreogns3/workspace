package study1.a;

public class B extends A {
  private int x;
  private int y;

  public B (){
    this.x = 1;
    this.y = 1;
  }

  public B(int a){
    super(a);
    this.x = 1;
    this.y = 1;
  }

  public B(int a, int b){
    super(a, b);
    this.x = 1;
    this.y = 1;
  }

  public B(int a, int b, int c){
    super(a, b, c);
    this.x = c;
    this.y = 1;
  }

  public B(int a, int b, int c, int d){
    super(a, b, c, d);
    this.x = c;
    this.y = d;
  }

  public void disp(){
    super.bp();
    System.out.print("x = " + this.x + ", ");
    System.out.println("y = " + this.y + ", ");
  }

}



  class Work {
    public static void main(String[] args) {
      B bp = new B();
      B bp1 = new B(10);
      B bp2 = new B(10, 20);
      B bp3 = new B(10, 20, 30);
      B bp4 = new B(10, 20, 30, 40);
      bp.disp();
      bp1.disp();
      bp2.disp();
      bp3.disp();
      bp4.disp();
    }

}
