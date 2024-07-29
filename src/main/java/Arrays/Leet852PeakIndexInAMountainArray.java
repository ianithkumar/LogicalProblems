package Arrays;

public class Leet852PeakIndexInAMountainArray {
  public static void main(String[] a){
    int arr[] = {20,69,100,99,79,78,67,65,43,42,21};
    int resultIndex = peakIndexInAMountainArray(arr);
    System.out.println(resultIndex);
  }
  private static int peakIndexInAMountainArray(int[] arr){
    int left = 0;
    int right = arr.length-1;

    while(left < right){
      int mid = (left+right)/2;

      if(arr[mid]<arr[mid+1]){
        left = mid+1;
      }
      else if (arr[mid]>arr[mid+1]){
        right = mid;
      }

    }
    return left;
  }
}
