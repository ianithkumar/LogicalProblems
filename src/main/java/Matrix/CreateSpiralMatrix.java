package Matrix;

import java.util.List;

public class CreateSpiralMatrix {
  public static void main(String[] a) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    int size = (int) Math.sqrt(arr.length);
    if (size * size == arr.length) {
      int[][] result = createSpiralMatrix(arr, size);
      printMatrix(result);
      System.out.println("Calling Leet54SpiralMatrix");
      List<Integer> resultFromSpiralMatrix = Matrix.Leet54SpiralMatrix.spiralMatrix(result);
      System.out.println(resultFromSpiralMatrix);
    } else {
      System.out.println("The Array is not valid to create Spiral Matrix");
    }
  }

  private static int[][] createSpiralMatrix(int[] arr, int size) {
    int[][] matrix = new int[size][size];
    int index = 0;
    int left = 0;
    int right = size - 1;
    int top = 0;
    int bottom = size - 1;

    while (left <= right && top <= bottom) {
      for (int i = left; i <= right; i++) {
        matrix[top][i] = arr[index++];
      }
      top++;

      for (int i = top; i <= bottom; i++) {
        matrix[i][right] = arr[index++];
      }
      right--;

      for (int i = right; i >= left; i--) {
        matrix[bottom][i] = arr[index++];
      }
      bottom--;

      for (int i = bottom; i >= top; i--) {
        matrix[i][left] = arr[index++];
      }
      left++;

    }
    return matrix;
  }

  private static void printMatrix(int[][] matrix) {
    for (int[] nums : matrix) {
      for (int num : nums) {
        System.out.print(num + "  ");
      }
      System.out.println();
    }
  }
}
