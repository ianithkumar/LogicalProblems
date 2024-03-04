package Numbers;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
  public static void main(String a[]) {
    int[] num = {100, 1, 101, 2, 75, 74, 3, 4, 103, 100};
    int result = longestConsecutiveSequence(num);
    System.out.println(result);
  }

  public static int longestConsecutiveSequence(int[] num) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < num.length; i++) {
      set.add(num[i]);
    }
    System.out.println(set);
    int count = 0;
    int maxCount = 0;

    for (int element : set) {
      if (!set.contains(element - 1)) {
        count = 1;
        int index = element;

        while (set.contains(index + 1)) {
          count++;
          index++;
        }
        maxCount = Math.max(maxCount, count);
      }
    }
    return maxCount;
  }

}


