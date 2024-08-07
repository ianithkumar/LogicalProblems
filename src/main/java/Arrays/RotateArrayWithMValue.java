package Arrays;

public class RotateArrayWithMValue {   //
  public static void main(String[] a){
    int[] arr = {2,3,4,5,6};
    int M = 3;
    int length = arr.length-1;
    int[] result = rotateArray(arr,length,M);
    for(int num:result){
      System.out.print(num+" ");
    }
  }
  private static int[] rotateArray(int[] arr,int length,int M){
    int left = 0;
    int right = M-1;
    while(left<length-M){
      arr = reverse(arr,left,right);
      left = left+M;
      right = right+M;
    }
    arr = reverse(arr,left,right);
    return arr;
  }
  private static int[] reverse(int[] arr,int left,int right){
    while(left<=right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    return arr;
  }
}
