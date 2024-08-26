package Matrix;

public class RotateAnImage {
  public static void main(String a[]) {
    int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //int n = matrix.length;
    System.out.println("Before Rotation");
    for(int[] nums:matrix){
      for(int num:nums){
        System.out.print(num+" ");
      }
      System.out.println();
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = i; j < matrix[i].length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      int start = 0;
      int end = matrix.length - 1;
      while (start < end) {
        int temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;
        start++;
        end--;
      }
    }
    System.out.println("After Rotation");
    for(int[] nums:matrix){
      for(int num:nums){
        System.out.print(num+" ");
      }
      System.out.println();
    }
  }
}

