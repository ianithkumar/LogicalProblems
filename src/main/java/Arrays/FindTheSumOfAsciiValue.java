package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindTheSumOfAsciiValue {
  public static void main(String a[]) {
    char[] arr1 = {'A', 'B', 'C'};
    char[] arr2 = {'B', 'C', 'D'};
    FindTheSumOfAsciiValue obj = new FindTheSumOfAsciiValue();
//
//    int finalNumber = 0;
//    Set<Integer> uniqueElement = getUniqueElement(arr1, arr2);
//
//    for (int num : uniqueElement) {
//      finalNumber += num;
//    }
//    int finalAnswer = findSum(finalNumber);
//    System.out.println(finalAnswer);

    System.out.println(obj.findSumAscii(arr1, arr2));
  }

  public int findSumAscii(char[] temp1, char[] temp2) {
    int finalNumber = 0;
    Set<Integer> uniqueElement = getUniqueElement(temp1, temp2);

    for (int num : uniqueElement) {
      finalNumber += num;
    }
    int finalAnswer = findSum(finalNumber);
    //System.out.println(finalAnswer);
    return finalAnswer;
  }

  private static int findSum(int finalNum) {

    while (finalNum >= 10) {
      finalNum = findDigit(finalNum);
    }
    return finalNum;
  }

  private static int findDigit(int num) {
    int answer = 0;
    while (num != 0) {
      answer = answer + (num % 10);
      num = num / 10;
    }
    return answer;
  }

  private static Set<Integer> getUniqueElement(char[] arr1, char[] arr2) {
    Set<Integer> temp1 = new HashSet<>();
    Set<Integer> temp2 = new HashSet<>();

    Set<Integer> result = new HashSet<>();

    for (int value : arr1) {
      temp1.add(value);
    }

    for (int value : arr2) {
      temp2.add(value);
    }

    for (int num : temp1) {
      if (!temp2.contains(num)) {
        result.add(num);
      }
    }

    for (int num : temp2) {
      if (!temp1.contains(num)) {
        result.add(num);
      }
    }

    return result;
  }
}
