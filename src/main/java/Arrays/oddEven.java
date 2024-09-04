package Arrays;

public class oddEven {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    String[] result = oddeven(arr);
    for (String str : result) {
      System.out.println(str);
    }
  }

  private static String[] oddeven(int[] arr) {
    String[] result = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        result[i] = "odd";
      } else {
        result[i] = "even";
      }
    }
    return result;
  }
}

