package SlidingWindow;

public class MaximumAverageSubarray {
  public static void main(String a[]){
    int[] nums = {1,12,-5,-6,50,3};
    int k = 4;                         //Output = 12.75
    System.out.println(maxAverageSubarray(nums,k));
  }
  private static int maxAverageSubarray(int[] nums,int k){
    int max = Integer.MIN_VALUE;
    int start = 0;
    int end = 0;
    int windowSum = 0;

    for(int i=0;i<nums.length;i++){
      windowSum +=nums[end];
      if(end-start ==k){
        max = Math.max(max,((windowSum)/(k)));
        windowSum -= nums[start];
        start++;
      }
    }
    return max;
  }
}
