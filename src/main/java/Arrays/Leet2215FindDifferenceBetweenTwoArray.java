package Arrays;

import java.util.*;

public class Leet2215FindDifferenceBetweenTwoArray {
  public static void main(String a[]){
    int nums1[] = {1,2,3};
    int nums2[] = {2,4,6};
    List<List<Integer>> result = findDifference(nums1,nums2);
    System.out.println(result);
  }
  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> set1 = new HashSet<>();
    for(int i=0;i<nums1.length;i++){
      for(int j=0;j<nums2.length;j++){
        if(nums1[i]!=nums2[j]){
          set1.add(nums1[i]);
        }
      }
    }
    List<Integer> arr1 = new ArrayList<>(set1);
    result.add(arr1);
    Set<Integer> set2 = new HashSet<>();
    for(int i=0;i<nums1.length;i++){
      for(int j=0;j<nums2.length;j++){
        if(nums2[i]!=nums1[j]){
          set2.add(nums2[i]);
        }
      }
    }
    List<Integer> arr2 = new ArrayList<>(set2);
    result.add(arr2);
    return result;
  }
}
