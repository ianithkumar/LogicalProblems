package List;

import java.util.ArrayList;
import java.util.List;

public class LEET1431KidsWiththeGreatestNumberofCandies {
  public static void main(String a[]) {
    int arrOfCandies[] = {2, 3, 5, 1, 3};
    int extraCandies = 3;
    List<Boolean> result = kidsWithCandies(arrOfCandies, extraCandies);
    System.out.println(result);
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;

    for (int candy : candies)
      max = Math.max(max, candy);

    List<Boolean> result = new ArrayList<>();

    for (int candy : candies)
      result.add(max <= candy + extraCandies);

    return result;
  }
}
