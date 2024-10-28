package Numbers;

public class NumberPalindrome {
  public static void main(String[] args) {
    int num  = 121;
    System.out.println(numberPalindrome(num));
  }
  private static Boolean numberPalindrome(int num){
    String str = String.valueOf(num);
    int i=0;
    int j = str.length()-1;
    char[] ch = str.toCharArray();
    while(i<j){
      if(ch[i]!=ch[j]){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
