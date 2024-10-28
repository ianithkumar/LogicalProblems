package OtherThings;

import java.util.Scanner;
import java.util.Arrays;
public class TcsCodevitaPractiveBestBubble {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int num = sc.nextInt();
    int[] arr = new int[num];
    System.out.print("Enter the array elements : ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int ascendSwap = bubbleSortAscend(arr);
    int descendSwap = bubbleSortDescend(arr);
    System.out.println(ascendSwap);
    int result = Math.min(ascendSwap,descendSwap);
    System.out.println(result);
  }

  private static int bubbleSortAscend(int[] arr) {
    int size = arr.length;
    int swapCount = 0;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if(arr[j]>arr[j+1]){
          swap(arr,j,j+1);
          swapCount++;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    return swapCount;
  }

  private static int bubbleSortDescend(int[] arr) {
    int size = arr.length;
    int swapCount = 0;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; i++) {
        if(arr[j]<arr[j+1]){
          swap(arr,j,j+1);
          swapCount++;
        }
      }
    }
    //System.out.println(Arrays.toString(arr));
    return swapCount;
  }
  private static int[] swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }
}
