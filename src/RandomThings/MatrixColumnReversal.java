package RandomThings;

public class MatrixColumnReversal {

  public static void main(String a[]){
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    for(int i=0;i<arr.length;i++){
      int row = 2;
      for(int j=0;j<arr[i].length;j++){
        if(i%2==0){
          System.out.print(arr[row][i]+" ");
        }
        else{
          System.out.print(arr[i][j]+" ");
        }
        row--;
      }
      System.out.println();
    }
  }
}
