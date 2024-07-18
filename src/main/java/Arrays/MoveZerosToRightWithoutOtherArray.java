package Arrays;

public class MoveZerosToRightWithoutOtherArray {
  public static void main(String a[]) {
    int arr[] = {0, 0, 2, 0, 3, 0, 4, 3, 5, 0, 0, 0, 0, 3, 4, 0, 8, 9, 7, 6, 5, 4};
    moveZeros(arr);
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  private static int[] moveZeros(int[] arr) {
    int nonZeroIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[nonZeroIndex];
        arr[nonZeroIndex] = temp;
        nonZeroIndex++;
      }
    }
    return arr;
  }
}
