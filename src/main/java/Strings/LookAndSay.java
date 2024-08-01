package Strings;

public class LookAndSay {
  public static void main(String[] a) {
    String startNum = "1";
    int endNum = 4;
    for (int i = 1; i <= endNum; i++) {
      startNum = generateNextTerm(startNum);
    }
    System.out.println(startNum);
  }

  private static String generateNextTerm(String num) {
    //String result = "";
    StringBuilder result = new StringBuilder();
    int count = 1;

    for (int i = 1; i < num.length(); i++) {
      if (num.charAt(i) == num.charAt(i - 1)) {
        count++;
      } else {
        //result = result+count+num.charAt(i-1);
        result.append(count).append(num.charAt(i - 1));
        count = 1;
      }
    }
    return result.toString();
  }

}
