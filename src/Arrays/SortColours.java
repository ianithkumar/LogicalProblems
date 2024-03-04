package Arrays;

public class SortColours {  // Here red = 0;white = 1;blue = 2 output should be in red,white,blue
  public static void main(String a[]){
    int arr[] = {1,0,2,0,1,2,0,1,2,0,0,1,2,0};
    int i=0;
    int j= arr.length-1;
    int k=0;

    while(k<=j){
      if(arr[k]==0){
        int temp = arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
        i++;
        k++;
      }
      else if(arr[k]==1){
        k++;
      }
      else{
        int temp = arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
        j--;
        //k++;  //Here 'k' is not increment because we need to check the swapped value again
      }

    }
    System.out.println("AFTER SORTING COLOURS");
    for(int num : arr){
      System.out.print(num+" ");
    }
  }
}
