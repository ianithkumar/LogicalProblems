package Strings;

import java.util.Scanner;

public class StringPalindrome {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str = sc.next();
    String strPalin = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      strPalin = strPalin + str.charAt(i);
    }
    if (strPalin.equals(str)) {
      System.out.println("The Given String Is A Palindrome");
    } else {
      System.out.println("The Given String Is Not A Palindrome");
    }
  }
}
