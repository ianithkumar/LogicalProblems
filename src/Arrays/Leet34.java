package Arrays;

public class Leet34 {
  public static void main(String a[]){
    int nums[] = {1};
    int target = 1;
    int[] result = searchRange(nums,target);
    for(int num:result){
      System.out.print(num);
    }
  }
  public static int[] searchRange(int[] nums, int target) {
    int result[] = new int[2];
    int j=0;
    int count=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]==target){
        result[j] = i;
        j++;
        count++;
      }
    }
    if(count==0) return new int[]{-1,-1};
    return new int[]{result[0],result[j-1]};

  }
}
