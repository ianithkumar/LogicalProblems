package RandomThings;

import java.util.Scanner;

public class juspayqn {
  public static void main(String a[]){
//    Scanner sc = new Scanner(System.in);
//    int n=sc.nextInt();
//    int arr[] = new int[n];
//    for(int i=0;i<n;i++){
//      arr[i]=sc.nextInt();
//    }
    int arr[] = {2,-9,15,2};
    int n=arr.length;
    int sum=0,ans=0;
    for(int i=0;i<n;i++){
      sum+=arr[i];
      if(sum<1){
        sum=-sum;
        ans+=sum;
        sum=0;
      }
    }
    System.out.println(ans);
  }
}
