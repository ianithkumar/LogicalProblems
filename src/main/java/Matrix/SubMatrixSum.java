package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SubMatrixSum {
  public static void main(String[] a) {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    int k = 2;
    List<Integer> resultSum = new ArrayList<>();

    for (int row = 0; row <= matrix.length - k; row++) {
      for (int col = 0; col <= matrix[0].length - k; col++) {
        resultSum = subMatrixSum(matrix, row, col, k, resultSum);
      }
    }
    System.out.println(resultSum);
  }

  private static List<Integer> subMatrixSum(int[][] matrix, int row, int col, int k, List<Integer> resultSum) {
    int curSum = 0;
    for (int i = 0; i < k; i++) {
      for (int j = 0; j < k; j++) {
        curSum = curSum + matrix[i + row][j + col];
      }
    }
    resultSum.add(curSum);
    return resultSum;
  }
}
