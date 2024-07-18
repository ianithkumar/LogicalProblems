package Numbers;

public class IntegerToRoman {
  public static void main(String a[]) {
    int num = 2994;
    String result = integerToRoman(num);
    System.out.println(result);
  }

  private static String integerToRoman(int num) {
    int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String romanValues[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
      while (num >= values[i]) {
        num -= values[i];
        result.append(romanValues[i]);
      }
    }
    return result.toString();
  }
}
