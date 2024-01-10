package Arrays;

public class RotateAnArray {
  public static void main(String a[]) {
    int arr[] = {1, 2, 3, 4, 5};
    int k = 3;
    for (int i = 0; i < k; i++) {
      int last = arr[arr.length - 1];
      for (int j = arr.length - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[0] = last;
    }
    for (int l = 0; l < arr.length; l++) {
      System.out.print(arr[l] + " ");
    }
  }
}
