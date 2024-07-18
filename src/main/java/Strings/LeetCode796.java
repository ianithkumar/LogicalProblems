package Strings;

public class LeetCode796 {
  public static void main(String a[]){
    String str = "anith";
    String requiredResult = "thani";
    boolean result  = rotate(str,requiredResult);
    System.out.println(result);
  }
  private static boolean rotate(String str,String requiredResult){
    String temp = str+str;
    return temp.contains(requiredResult);
  }
}
