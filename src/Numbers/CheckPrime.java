package Numbers;

import java.util.Scanner;

public class CheckPrime {
  public static void main(String a[]) {
    System.out.println("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    //boolean result = CheckPrime(num);
    boolean result = checkPrime(num);
    if (result == true) {
      System.out.println("The Given Number Is A Prime Number");
    } else {
      System.out.println("The Given Number Is Not A Prime Number");
    }
  }

  private static boolean CheckPrime(int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      return true;
    } else {
      return false;
    }
  }

  //optimized version
  public static boolean checkPrime(int num) {
    if (num < 2) {
      return true;
    }
    int i = 2;
    while (i <= num / 2) {
      if (num % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
}
