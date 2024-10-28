package Arrays;
import java.util.Arrays;

public class RotateAnArrayBy1 {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    rotateAnArrayBy1(arr);
    System.out.println(Arrays.toString(arr));
  }
  private static void rotateAnArrayBy1(int[] arr){
    int last = arr[arr.length - 1];
    for (int j = arr.length - 1; j > 0; j--) {
      arr[j] = arr[j - 1];
    }
    arr[0] = last;
  }
}
