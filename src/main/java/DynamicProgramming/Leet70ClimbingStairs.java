package DynamicProgramming;

public class Leet70ClimbingStairs {
  public static void main(String[] a) {
    int num = 10;
    System.out.println(climbingStairs(num));
  }

  private static int climbingStairs(int num) {


    int[] dp = new int[num + 1];
    dp[1] = 1;
    dp[2] = 2;

    for (int i = 3; i < dp.length; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[num];
  }
}
