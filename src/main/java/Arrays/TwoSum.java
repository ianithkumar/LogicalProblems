package Arrays;

public class TwoSum {
  public static void main(String a[]) {
    int arr[] = {2, 7, 11, 15};
    int target = 9;
    for (int i = 0; i <= arr.length - 1; i++) {
      for (int j = i + 1; j <= arr.length - 1; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println("[" + i + "," + j + "]");
        }
      }
    }
  }
}
