package TwoPointer;

public class ContainerWithMostWater {
  public static void main(String a[]){
    int[] height = {1,8,6,2,5,4,8,3,7};           //Output = 49
    int result = containerWithMostWater(height);
    System.out.println(result);
  }
  private static int containerWithMostWater(int[] height){
    int left_pointer = 0;
    int right_pointer = height.length-1;
    int maxWater = 0;

    while(left_pointer<=right_pointer){
      int width = (right_pointer-left_pointer);
      int heightTemp = Math.min(height[left_pointer],height[right_pointer]);
      int area = heightTemp*width;
      maxWater = Math.max(maxWater,area);

      if(height[left_pointer] < right_pointer) {
        left_pointer++;
      } else{
        right_pointer--;
      }

    }
    return maxWater;
  }
}
