package SlidingWindow;

public class Leet643MaximumAverageSubarray {
  public static void main(String a[]){
    int[] nums = {1,12,-5,-6,50,3};
    int k = 4;                         //Output = 12.75
    System.out.println(maxAverageSubarray(nums,k));
  }
  private static double maxAverageSubarray(int[] nums,int k){
    double max = Integer.MIN_VALUE;
    int start = 0;
    int windowSum = 0;

    for(int end=0;end<nums.length;end++){
      windowSum +=nums[end];
      if(end-start+1 ==k){
        max = Math.max(max,((int)windowSum)/(double)k);
        windowSum -= nums[start];
        start++;
      }
    }
    return (double)max;
  }
}
