package Arrays;

import java.util.Arrays;

public class ArraySubset {
  public static void main(String[] args) {
    long[] arr1 = {11, 7, 1, 13, 21, 3, 7, 3};
    long[] arr2 = {11, 3, 7, 1, 7};
    System.out.println(arraySubSet(arr1,arr2));
  }
  static boolean arraySubSet(long[] arr1,long[] arr2){
    long max = Integer.MIN_VALUE;
    for(long num:arr1) {
      if (num >= max) {
        max = num;
      }
    }
    int size = (int)max;
    long[] arr1Count =  new long[size+1];

    for(long num:arr1){
      int temp = (int)num;
      arr1Count[temp]++;
    }

    for(long num:arr2){
      int temp1 = (int)num;
      if(arr1Count[temp1]==0){
        return false;
      }
      arr1Count[temp1]--;
    }
    return true;
  }
}
