package Numbers;

public class FibonacciSeriesUsingBottomUp {
  public static void main(String a[]) {
    int num = 6;
    int result = fib(num);
    System.out.println(result);
  }

  private static int fib(int n) {
    int[] memo = new int[n + 1];
    int result = 0;
    for (int i = 1; i <= n; i++) {
      if (i <= 2) {
        result = 1;
      } else {
        result = memo[i - 1] + memo[i - 2];
      }
      memo[i] = result;
    }
    return memo[n];
  }
}
