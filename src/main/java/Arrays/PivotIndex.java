package Arrays;

public class PivotIndex {
  public static void main(String a[]){
    int arr[] = {1,7,3,6,5,6};
    int result = pivotIndex(arr);
    System.out.println(result);
  }

  private static int pivotIndex(int[] arr) {
    int totalSum = 0;
    for(int num:arr){
      totalSum+=num;
    }
    int leftSum = 0;
    for(int i=0;i<arr.length;i++){
      if(leftSum==totalSum-leftSum-arr[i]){
        return i;
      }
      leftSum+=arr[i];

    }
    return -1;
  }
}
