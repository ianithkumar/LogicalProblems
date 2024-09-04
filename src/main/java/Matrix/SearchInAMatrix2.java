package Matrix;

public class SearchInAMatrix2 {
  public static void main(String[] args) {
    int[][] matrix = {{1, 4, 7, 11, 15},
        {2, 5, 8, 12, 19},
        {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}};
    int target = 15;
    int[] result = searchInAMatrix2(matrix, target);
    for (int num : result) {
      System.out.print(num + " ");
    }
  }

  private static int[] searchInAMatrix2(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;
    int row = 0;
    int col = m - 1;
    while (row < n && col >= 0) {
      if (matrix[row][col] == target) {
        return new int[]{row, col};
      } else if (matrix[row][col] < target) {
        row++;
      } else {
        col--;
      }
    }
    return new int[]{-1, -1};
  }
}
