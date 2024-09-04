package Numbers;

public class FibonacciSeries {
  public static void main(String a[]) {
    int num = 6;
    int result = fib(num);
    System.out.println(result);
  }

  public static int fib(int num) {
    int result;
    if (num == 1 || num == 2) {
      result = 1;
    } else {
      result = fib(num - 1) + fib(num - 2);
    }
    return result;
  }
}
