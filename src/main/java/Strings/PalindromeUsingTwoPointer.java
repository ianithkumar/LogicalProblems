package Strings;

public class PalindromeUsingTwoPointer {
  public static void main(String[] args) {
    String str = "anithhtina";
    System.out.println(stringPalindrome(str));
  }

  private static boolean stringPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
