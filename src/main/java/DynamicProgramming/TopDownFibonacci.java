package DynamicProgramming;

public class TopDownFibonacci {
  public static void main(String[] a) {
    int num = 7;                                      //0, 1, 1, 2, 3, 5, 8
    System.out.println(topDownFibonacci(num));
  }

  private static int topDownFibonacci(int num) {
    int[] memo = new int[num + 1];

    if (num <= 2) {
      return 1;
    }
    if (memo[num] != 0) {
      return memo[num];
    }

    memo[num] = topDownFibonacci(num - 1) + topDownFibonacci(num - 2);

    return memo[num];
  }
}
