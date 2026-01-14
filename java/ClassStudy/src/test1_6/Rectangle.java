package test1_6;

public class Rectangle {
  private int x1, y1, x2, y2;

  public Rectangle(){}

  public Rectangle(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }

  public void set(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }

  public int square(){
    return (Math.max(x1,x2) - Math.min(x1,x2)) * (Math.max(y1,y2) - Math.min(y1,y2));
  }

  public void show(){
    System.out.println("(x1,y1) : (" + x1 + "," + y1 + ")");
    System.out.println("(x2,y2) : (" + x2 + "," + y2 + ")");
    System.out.println("넓이 : " + square());
  }

  public boolean equals(Rectangle r){
    return square() == r.square();
  }


}
