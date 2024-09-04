package Numbers;

public class Multiply {
  public static void main(String a[]) {
    int num = 50;

    for (int i = 0; i < 2; i++) {
      int carry;
      int temp = num;
      while (temp != 0) {
        carry = num & temp;
        num = num ^ temp;
        temp = carry << 1;
      }
    }
    System.out.println(num);
  }
}
