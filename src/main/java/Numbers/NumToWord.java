package Numbers;

import java.util.Scanner;

public class NumToWord {
  public static void main(String a[]){
    System.out.println("Enter the number = ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num<0){
      System.out.println("Invalid Value");
    } else {
      int reverse = reverserNumber(num);
      String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
      while(reverse!=0){
        int digi = reverse % 10;
        System.out.print(words[digi]+" ");
        reverse = reverse / 10;
      }
    }
  }

  private static int reverserNumber(int num) {
    int temp = 0;
    while(num!=0){
      int digit = num % 10;
      temp = temp * 10 + digit;
      num = num / 10;
    }
    return temp;
  }
}
