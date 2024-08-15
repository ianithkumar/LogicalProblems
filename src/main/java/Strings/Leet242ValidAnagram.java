package Strings;

public class Leet242ValidAnagram {
  public static void main(String[] a) {
    String s1 = "rat";
    String s2 = "car";
    System.out.println(isValidAnagram(s1, s2));
  }

  private static boolean isValidAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    int[] count = new int[26];
    for (int i = 0; i < s1.length(); i++) {
      count[s1.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s1.length(); i++) {
      count[s2.charAt(i) - 'a']--;
    }
    for (int j : count) {
      if (j != 0) {
        return false;
      }
    }
    return true;
  }
}
