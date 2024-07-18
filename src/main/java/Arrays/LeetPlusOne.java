package Arrays;

public class LeetPlusOne {
    public static void main(String a[]){
      int arr[] = {9,9,9};
      int[] result = plusOne(arr);
      for(int i=0;i<result.length;i++){
        System.out.print(result[i]);
      }
    }
    private static int[] plusOne(int arr[]){
      int n = arr.length;
      int carry = 1;
      for(int i=n-1;i>=0;i--){
        int num = carry+arr[i];
        if(num==10){
          carry = 1;
          arr[i] = 0;
        } else{
          carry = 0;
          arr[i] = num;
        }
      }
      if(carry == 1){
        arr = new int[arr.length+1];
        arr[0] = 1;
      }

      return arr;
    }
}
