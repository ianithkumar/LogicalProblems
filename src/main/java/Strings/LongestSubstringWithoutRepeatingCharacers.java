package Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacers {
  public static void main(String[] args){
    String s = "cadbzabcd";
    System.out.println(longestSubstringWithoutRepeatingCharacters(s));
  }
  private static int longestSubstringWithoutRepeatingCharacters(String s){
    int aPointer = 0;
    int bPointer = 0;
    int max = 0;
    HashSet<Character> set = new HashSet<>();
    while(bPointer!=s.length()-1){
      if(!set.contains(s.charAt(bPointer))){
        set.add(s.charAt(bPointer));
        max = Math.max(set.size(),max);
        bPointer++;
      }
      else{
        set.remove(s.charAt(bPointer));
        aPointer++;
      }
    }

    return max;
  }
}
