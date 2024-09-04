package Arrays;

public class Leet1295FindNumbersWithEvenNumberOfDigit {
  public static void main(String a[]) {
    int num[] = {12, 345, 2, 6, 7896, 45};
    int result = findMaxOFEvenDigits(num);
    System.out.println(result);
  }

  private static int findMaxOFEvenDigits(int[] num) {
    int count = 0;
    for (int i = 0; i < num.length; i++) {
      int temp = (int) Math.log10(num[i]) + 1;
      if (temp % 2 == 0) {
        count++;
      }
    }
    return count;
  }

}
