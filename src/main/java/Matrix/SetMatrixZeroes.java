package Matrix;

public class SetMatrixZeroes {
  public static void main(String a[]) {
    int arr[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int rowLength[] = new int[arr.length];
    int columnLength[] = new int[arr[0].length];

    System.out.println("Before Matrix To Zero");

    for (int[] nums : arr) {
      for (int num : nums) {
        System.out.print(num + " ");
      }
      System.out.println();
    }


    for (int i = 0; i < rowLength.length; i++) {
      for (int j = 0; j < columnLength.length; j++) {
        if (arr[i][j] == 0) {
          rowLength[i] = 1;
          columnLength[j] = 1;
        }
      }
    }

    for (int i = 0; i < rowLength.length; i++) {
      for (int j = 0; j < columnLength.length; j++) {
        if (rowLength[i] == 1 || columnLength[j] == 1) {
          arr[i][j] = 0;
        }
      }
    }

    System.out.println("After Matrix To Zero");

    for (int[] nums : arr) {
      for (int num : nums) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

  }
}
