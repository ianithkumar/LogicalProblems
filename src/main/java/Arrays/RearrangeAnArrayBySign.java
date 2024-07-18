package Arrays;

public class RearrangeAnArrayBySign {
  public static void main(String a[]) {
    int arr[] = {-1, 3, -2, -4, 5, 6};
    int result[] = new int[arr.length];
    int pos = 0;
    int neg = 1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        result[pos] = arr[i];
        pos += 2;
      } else {
        result[neg] = arr[i];
        neg += 2;
      }
    }

    System.out.println("After Arranging");
    for (int num : result) {
      System.out.print(num+" ");
    }

  }
}
