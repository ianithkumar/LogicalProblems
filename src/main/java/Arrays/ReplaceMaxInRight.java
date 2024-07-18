package Arrays;

import java.util.Scanner;

public class ReplaceMaxInRight {
  public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    System.out.println("Ent the array values:");
    int[] arr = new int[size];
    for(int i=0;i<size;i++){
      arr[i] = sc.nextInt();
    }
    int maxFromRight = arr[size-1];
    arr[size-1] = -1;
    for(int j=size-2;j>=0;j--){
      int temp = arr[j];
      arr[j] = maxFromRight;
      if(temp>maxFromRight){
        maxFromRight = temp;
      }
    }

    System.out.println("Output : ");
    for(int num:arr){
      System.out.print(num+" ");
    }
  }
}
