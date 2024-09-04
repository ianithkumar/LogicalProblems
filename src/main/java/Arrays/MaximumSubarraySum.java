package Arrays;

public class MaximumSubarraySum {
  public static void main(String[] a) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};           //Output = 6 {4,-1,2,1};
    //int[] arr = {-1,-2,-3,-4,-5};
    System.out.println(minimumSubarraySum(arr));
  }

  private static int minimumSubarraySum(int[] arr) {
    int sum = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
      if (sum > max) {
        max = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
    }
    return max;
  }
}
