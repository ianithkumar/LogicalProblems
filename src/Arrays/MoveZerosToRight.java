package Arrays;

public class MoveZerosToRight {
  public static void main(String a[]) {
    int arr[] = {0, 0, 2, 0, 3, 0, 4};
    int result[] = new int[arr.length];
    int start = 0;
    int end = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        result[end] = arr[i];
        end--;
      } else if (arr[i] > 0) {
        result[start] = arr[i];
        start++;
      }
    }
    for (int j = 0; j < result.length; j++) {
      System.out.print(result[j] + " ");
    }
  }
}
