package GreedyAlgorithm;

public class Leet55JumpGame {
  public static void main(String[] a) {
    int[] nums = {2, 3, 1, 1, 4};
    System.out.println(jumpGame(nums));
  }

  private static boolean jumpGame(int[] nums) {
    int stepLeft = nums[0];
    for (int i = 1; i < nums.length; i++) {
      stepLeft--;

      if (stepLeft < 0) {
        return false;
      }
      if (i == nums.length - 1) {
        return true;
      }
      if (stepLeft < nums[i]) {
        stepLeft = nums[i];
      }
    }
    return true;
  }
}
