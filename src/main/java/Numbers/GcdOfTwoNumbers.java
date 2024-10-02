package Numbers;

public class GcdOfTwoNumbers {
  public static void main(String[] args){
    int a = 3;
    int b = 6;
    System.out.println(gcdOfTwoNumber(a,b));
  }
  private static int gcdOfTwoNumber(int a,int b){
    if(b==0){
      return a;
    }
    return gcdOfTwoNumber(b,a%b);
  }
}
