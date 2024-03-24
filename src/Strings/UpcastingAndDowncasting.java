package Strings;

public class UpcastingAndDowncasting {
  static class A{
    public void show1(){
      System.out.println("IN A SHOW");
    }
  }
  static class B extends A{
    public void show2(){
      System.out.println("IN B SHOW");
    }
  }
  public static void main(String a[]){
    A obj = (A) new B();
    obj.show1();

    B obj2 = (B) obj;
    obj2.show2();

  }
}
