package Numbers;

public class AddingTwoNumberWithoutOperator {
  public static void main(String[] args) {
    int x = 20;
    int y = 30;

    while (y != 0) {
      int carry = x & y;
      x = x ^ y;
      y = carry << 1;
    }
    System.out.println(x);
  }
}
