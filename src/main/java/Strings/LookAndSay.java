package Strings;

public class LookAndSay {
  public static void main(String[] a) {
    String startNum = "1";
    int endNum = 6;
    for (int i = 1; i < endNum; i++) {
      startNum = generateNextTerm(startNum);
    }
    System.out.println(startNum);
  }

  private static String generateNextTerm(String num) {
    String result = "";
    int count = 1;
    int i = 1;
    int current = num.charAt(0);
    while(i<num.length()){
    if (num.charAt(i) == current) {
      count++;
    } else {
      result = result+count+num.charAt(i-1);
      count = 1;
      current = num.charAt(i);
    }
    i++;
  }
    result = result+count+num.charAt(i-1);
    return result;
  }

}
