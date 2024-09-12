package Matrix;

import java.util.*;

public class Leet54SpiralMatrix {
  public static void main(String a[]) {
    int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    List<Integer> result = spiralMatrix(matrix);
    System.out.println(result);
  }

  public static List<Integer> spiralMatrix(int matrix[][]) {
    List<Integer> result = new ArrayList<>();
    int size = matrix.length;
    int left = 0;
    int right = size - 1;
    int top = 0;
    int bottom = size - 1;

    while (left <= right && top <= bottom) {
      for (int i = left; i <= right; i++) {
        result.add(matrix[top][i]);
      }
      top++;

      for (int i = top; i <= bottom; i++) {
        result.add(matrix[i][right]);
      }
      right--;

      for (int i = right; i >= left; i--) {
        result.add(matrix[bottom][i]);
      }
      bottom--;

      for (int i = bottom; i >= top; i--) {
        result.add(matrix[i][left]);
      }
      left++;

    }
    return result;
  }
}
