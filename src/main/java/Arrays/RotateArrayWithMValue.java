package Arrays;

public class RotateArrayWithMValue {
  public static void main(String[] a) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int M = 3;
    System.out.println("Before Rotation : ");
    for (int num : arr) {
      System.out.print(num + " ");
    }

    for (int i = 0; i < arr.length; i = i + M) {
      int start = i;
      int end = start + M - 1;
      if (end < arr.length) {
        while (start < end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
      }
    }
    System.out.println();
    System.out.println("After Rotation : ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
