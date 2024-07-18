package RandomThings;

import java.util.ArrayList;
import java.util.List;

public class TwoSumUsingList {
  public static void main(String a[]){
    int arr[] = {2, 7, 11, 15};
    int target = 22;
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i <= arr.length - 1; i++) {
      for (int j = i + 1; j <= arr.length - 1; j++) {
        if (arr[i] + arr[j] == target) {
          result.add(arr[i]);
          result.add(arr[j]);
        }
      }
    }
    System.out.println(result);
  }
}
