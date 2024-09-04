package Strings;

public class StringReversel {
  public static void main(String args[]) {
    String sentence = "Hello World";
    char[] sentenceArray = sentence.toCharArray();
    int left = 0;
    int right = sentenceArray.length - 1;
    while (left < right) {
      char temp = sentenceArray[left];
      sentenceArray[left] = sentenceArray[right];
      sentenceArray[right] = temp;

      left++;
      right--;
    }
    System.out.println(sentenceArray);
  }
}
