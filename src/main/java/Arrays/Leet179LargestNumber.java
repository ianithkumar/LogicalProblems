package src.main.java.Arrays;

import java.util.Arrays;

public class Leet179LargestNumber {
  public static void main(String[] args){
    int[] arr = {10,2};
    System.out.println(largestNumber(arr));
  }
  private static String largestNumber(int[] arr){
    String[] num = new String[arr.length];
    for(int i=0;i<arr.length;i++){
      num[i] = Integer.toString(arr[i]);
    }

    Arrays.sort(num,(a,b)->(b+a).compareTo(a+b));

    StringBuilder result = new StringBuilder();
    for(String n:num){
      result.append(n);
    }
    return result.toString();
  }
}
