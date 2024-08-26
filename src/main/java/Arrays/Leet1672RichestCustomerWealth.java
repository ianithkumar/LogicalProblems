package Arrays;

public class Leet1672RichestCustomerWealth {
  public static void main(String a[]){
    int wealth[][] = {{1,2,3,4},{3,2,1,2}};
    int result = richestCustomerWealth(wealth);
    System.out.println(result);
  }

  private static int richestCustomerWealth(int[][] wealth) {
    int comp = 0;
    for(int i=0;i<wealth.length;i++){
      int sum = 0;
      for(int j=0;j<wealth[i].length;j++) {
        sum+=wealth[i][j];
      }
      if(sum>comp){
        comp = sum;
      }
    }
    return comp;
  }
}
