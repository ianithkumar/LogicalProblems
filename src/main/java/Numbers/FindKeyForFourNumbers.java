package Numbers;

public class FindKeyForFourNumbers {
  public static void main(String a[]){
    int num1 = 1234;
    int num2 = 2143;
    int num3 = 5321;

    int digits1[] = getDigit(num1);
    int digits2[] = getDigit(num2);
    int digits3[] = getDigit(num3);

    int[] resultArrray = new int[4];

    for(int i=0;i<4;i++){
      resultArrray[i] = Math.min(digits1[i],Math.min(digits2[i],digits3[i]));
    }
    int result = 0;
    for(int num:resultArrray){
      result = (result+num)*10;
    }
    result = result / 10;
    System.out.println(result);

  }
  private static int[] getDigit(int num){
    int[] digits = new int[4];
    for(int i=3;i>=0;i--){
      digits[i] = num%10;
      num = num / 10;
    }
    return digits;
  }
}
