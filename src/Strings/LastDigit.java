package Strings;

public class LastDigit {
  public static void main(String a[]){
    String a1 = "3";
    String b1 = "10";
    int num1 = Integer.parseInt(a1);
    int num2 = Integer.parseInt(b1);
    double result = Math.pow(num1,num2);
    System.out.println(((int)result)%10);

  }
}
