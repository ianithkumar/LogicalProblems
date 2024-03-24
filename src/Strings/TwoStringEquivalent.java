package Strings;

public class TwoStringEquivalent {
  public static void main(String a[]){
    String[] arr1 = {"ab","c"};
    String[] arr2 = {"a","bc"};
    boolean result = stringEquivalent(arr1,arr2);
    System.out.println(result);
  }

  private static boolean stringEquivalent(String[] arr1, String[] arr2) {
    String a = null;
    String b = null;
    for(int i=0;i<arr1.length;i++){
      a = a+arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
      b = b+arr2[i];
    }
    return a.equals(b);
  }
}
