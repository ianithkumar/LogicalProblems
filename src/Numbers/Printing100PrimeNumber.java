package Numbers;

import java.util.Scanner;

public class Printing100PrimeNumber {
  public static void main(String a[]) {
    System.out.println("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    PrintPrime(num);
  }
  private static void PrintPrime(int num) {
    int i=1,prcount = 1,count;
    while(prcount<=num) {
      count = 0;
      for(int j=1;j<=i;j++) {
        if(i%j==0){
          count++;
        }
      }
        if(count==2) {
          System.out.println(i);
          prcount++;
        }
      i++;
    }
  }
}
