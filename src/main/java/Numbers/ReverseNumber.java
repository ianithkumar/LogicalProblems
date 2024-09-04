package Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
  public static void main(String args[]) throws IOException {
    System.out.println("Enter a number : ");
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    int num = Integer.parseInt(br.readLine());
    int result = numReverse(num);
    System.out.println(result);
  }

  private static int numReverse(int num) {
    int reverse = 0, remain;
    while (num > 0) {
      remain = num % 10;
      reverse = reverse + remain;
      reverse = reverse * 10;
      num = num / 10;
    }
    reverse = reverse / 10;
    return reverse;
  }

}
