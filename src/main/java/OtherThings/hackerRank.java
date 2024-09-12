package src.main.java.OtherThings;

class Shape{
  int length;
  int breadth;
  public Shape(int length,int breadth){
    this.length = length;
    this.breadth = breadth;
  }
  public void area(){
    System.out.println(length+" "+breadth);
  }
}
class Rectangle extends Shape{
  int length;
  int breadth;
  public Rectangle(int length,int breadth){
    super(length,breadth);
    this.length = length;
    this.breadth = breadth;
  }
  public void area(){
    System.out.println(length*breadth);
  }
}
public class hackerRank {
  public static void main(String[] args){
    Shape obj1 = new Shape(4,5);
    obj1.area();
    Rectangle obj2 = new Rectangle(4,5);
    obj2.area();

  }
}
