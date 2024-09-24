package src.main.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumConsecutiveSubsequence {
  public static void main(String[] args){
    Integer[] arr = {45,5,2,3,1,4,6,7,8,15,13,10,16,12,11,14,23,56,78};  //Output : {10,11,12,13,14,15,16} -> 7
    System.out.println(maximumConsecutiveSubsequence(arr));
  }
  private static int maximumConsecutiveSubsequence(Integer[] arr){
    int currentLength;
    int maxLength = 1;
    for (int j : arr) {
      currentLength = 1;
      while (arrayContains(arr, j + 1)) {
        j=j+1;
        currentLength++;
      }
//      ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
//      while(list.contains(j+1)){
//        j++;
//        currentLength++;
//      }
      maxLength = Math.max(currentLength, maxLength);
    }
    return maxLength;
  }
  private static boolean arrayContains(Integer[] arr,int num){
    for (int j : arr) {
      if (j == num) {
        return true;
      }
    }
    return false;
  }
}
