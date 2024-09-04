package Strings;

import java.util.Arrays;
import java.util.List;

public class StringConcatWipro {
  public static void main(String[] args) {
    String[] words = {"Anith", "kumar", "Anithkumar", "ianithkumar", "Kumaranith"};
    int conCalCount = 2;
    String[] result = stringconcat(words, conCalCount);
    for (String str : result) {
      System.out.print(str + " ");
    }
  }

  private static String[] stringconcat(String[] words, int count) {
    String[] result = new String[words.length];
    for (int i = 0; i < words.length; i++) {
      String wordTemp = words[i];
      String finalWord = "";
      int midSize = wordTemp.length() / 2;
      char first = wordTemp.charAt(0);
      char middle = wordTemp.charAt(midSize);
      char last = wordTemp.charAt(wordTemp.length() - 1);
      finalWord += first;
      finalWord += middle;
      finalWord += last;
      StringBuilder resultWord = new StringBuilder();
      for (int j = 0; j <= count; j++) {
        resultWord.append(finalWord);
      }
      result[i] = resultWord.toString();
    }
    return result;
  }
}
