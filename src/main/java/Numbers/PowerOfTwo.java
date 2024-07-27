package Numbers;

import java.util.Scanner;

//Explanation
//2   =  0010      | 3   = 0011
//2-1 =  0001 &    | 3-1 = 0010 &
//Ans =  0000(True)| Ans = 0010(False)

public class PowerOfTwo {
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sc.nextInt();
    System.out.println(powerOfTwo(number));
  }
  private static boolean powerOfTwo(int number){
    if((number&number-1) == 0) {
      return true;
    }
    return false;
  }
}
