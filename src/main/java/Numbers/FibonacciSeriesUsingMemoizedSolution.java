package Numbers;

public class FibonacciSeriesUsingMemoizedSolution {
  public static void main(String a[]) {
    int num = 6;
    long result = fib(num);
    System.out.println(result);
  }

  private static long fib(int n) {
    long[] memo = new long[n + 1];
    long result = 0;
    if (memo[n] != 0) {
      result = memo[n];
    } else {
      if (n<=2) {
        result = 1;
        memo[n] = result;
      } else {
        result = fib(n - 1) + fib(n - 2);
        memo[n] = result;
      }
    }
    return memo[n];
  }

}
