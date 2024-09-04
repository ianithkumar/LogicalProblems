package Arrays;

public class Xor {
  public static void main(String[] arg) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    System.out.println(xor(arr));
  }

  private static int xor(int[] arr) {
    int oddSum = 0;
    for (int num : arr) {
      if (num % 2 != 0) {
        oddSum += num;
      }
    }
    int firstEven = 0;
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        firstEven = arr[i];
        index = i;
        break;
      }
    }

    for (int i = index + 1; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        firstEven = firstEven ^ arr[i];
      }
    }
    return oddSum - firstEven;
  }
}
