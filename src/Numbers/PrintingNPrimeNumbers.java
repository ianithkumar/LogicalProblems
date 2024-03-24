package Numbers;

import java.util.Scanner;

public class PrintingNPrimeNumbers {
  public static void main(String a[]) {
    System.out.println("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;
    int tempNum = 1;
    while (count < num) {
      if (isPrime(tempNum)) {
        System.out.println(tempNum);
        count++;
        tempNum++;
      } else {
        tempNum++;
      }
    }
  }

  private static boolean isPrime(int tempNum) {
    int tempCount = 0;
    for (int i = 1; i <= tempNum; i++) {
      if (tempNum % i == 0) {
        tempCount++;
      }
    }
    if (tempCount == 2) {
      return true;
    }
    return false;
  }

}
