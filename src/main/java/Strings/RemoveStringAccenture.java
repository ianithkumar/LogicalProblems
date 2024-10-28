package Strings;

public class RemoveStringAccenture {
  public static void main(String[] args) {
    String str1 = "AABCDEFGHABEFD";
    String str2 = "ABC";
    String result = removeString(str1,str2);
    System.out.println(result);
  }
  private static String removeString(String str1,String str2){
    char[] str1Temp = str1.toCharArray();
    for(char ch:str2.toCharArray()){
      for(int i=0;i<str1Temp.length;i++){
        if(str1Temp[i]==ch){
          str1Temp[i] = '0';
        }
      }
    }
    StringBuilder result = new StringBuilder();
    for(char ch:str1Temp){
      if(ch!='0'){
        result.append(ch);
      }
    }
    return result.toString();
  }
}
