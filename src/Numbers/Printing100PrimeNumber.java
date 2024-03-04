package Numbers;

import java.util.Scanner;

public class Printing100PrimeNumber {
  public static void main(String a[]) {
    System.out.println("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    //printPrime(num);
    generatePrime(num);
  }
  private static void printPrime(int num) {
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
  //optimized version
  private static void generatePrime(int num){
    System.out.print("1,2");
    if(num<=2){
      return;
    }
    System.out.print(",");
    for(int i=3;i<=num;i++){
      if(CheckPrime.checkPrime(i)){
        System.out.print(i+",");
      }
    }
  }
}
