package Numbers;

public class AdditionUsingBtwise {
  public static void main(String args[]) {
    int a = 100;
    int b = 4;
    while (b != 0) {
      int carry = a & b;
      a = a ^ b;
      b = carry << 1;
    }
    System.out.println(a);
  }
}
