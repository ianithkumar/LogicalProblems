package DynamicProgramming;

public class Leet198HouseRobber {
  public static void main(String[] a) {
    int[] arr = {2, 7, 9, 3, 1};                      //Output = 12

    System.out.print("The Answer is : " + houseRobber(arr));
  }

  private static int houseRobber(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    if (arr.length == 1) {
      return arr[0];
    }

    int dp[] = new int[arr.length];

    dp[0] = arr[0];
    dp[1] = Math.max(arr[0], arr[1]);

    for (int i = 2; i < dp.length; i++) {
      dp[i] = Math.max((arr[i] + dp[i - 2]), dp[i - 1]);
    }

    printArray(dp);

    return dp[arr.length - 1];
  }

  private static void printArray(int[] arr) {
    System.out.print("DP Array : ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
