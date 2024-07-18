package RandomThings;

public class BinarySearch {
  public static void main(String a[]){
    int arr[] = {1,2,3,4,6,7,8,9,13,16,19};
    int target = 7;
    int result = binarySearch(arr,target);
    //result++;
    System.out.println("Target fount in index : "+result);
  }

  private static int binarySearch(int[] arr,int target) {
    int left = 0;
    int right = arr.length-1;
    while(left<=right){
      int mid = (left+right)/2;
      if(arr[mid]==target){
        return mid;
      }
      else if(arr[mid]>target){
        right=mid-1;
      }
      else {
        left=mid+1;
      }
    }
    return -1;
  }
}
