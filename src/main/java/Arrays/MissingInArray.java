package Arrays;

public class MissingInArray {
  public static void main(String[] args){
    int[] arr = {1,2,3,5};
    int n = 5;
    System.out.println(missingInArray(arr,n));
  }
  private static int missingInArray(int[] arr,int n){
    int totalNum = n*(n+1)/2;
    int arrTotal = 0;
    for(int num:arr){
      arrTotal+=num;
    }
    return totalNum-arrTotal;
  }
}
