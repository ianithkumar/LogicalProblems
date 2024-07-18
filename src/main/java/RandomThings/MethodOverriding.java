package RandomThings;

public class MethodOverriding {
  public static void main(String a[]) {
    Calc obj = new AdvCalc();
    int result = obj.add(3, 4);
    System.out.println(result);

  }
}
  class Calc{
    public static int add(int n1,int n2){
      return n1+n2;
    }
  }

  class AdvCalc extends Calc{
    public static int add(int n1,int n2){
      return n1+n2+1;
    }
  }

