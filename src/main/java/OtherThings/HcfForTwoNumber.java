package OtherThings;

public class HcfForTwoNumber {
  public static void main(String[] args) {
    int num1 = -48;
    int num2 =  -60;
    System.out.println(hcfForTwoNumber(num1,num2));
  }
  private static int hcfForTwoNumber(int num1,int num2) {
    if(num1<0){
      num1=num1*-1;
    }
    if(num2<0){
      num2 = num2*-1;
    }
    if (num1 == 0) {
      return num2;
    } else if (num2 == 0) {
      return num1;
    } else {
      int upto = Math.max(num1, num2) / 2;
      int max = Integer.MIN_VALUE;
      for (int i = 1; i <= upto; i++) {
        if (num1 % i == 0 && num2 % i == 0) {
          if (max < i) {
            max = i;
          }
        }
      }
      return max;
    }
  }
}
