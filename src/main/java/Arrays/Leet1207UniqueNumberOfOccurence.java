package Arrays;
import java.util.*;
public class Leet1207UniqueNumberOfOccurence {
  public static void main(String a[]){
    int arr[] = {1,2,2,1,1,3};
    boolean result = uniqueOccurrences(arr);
    System.out.println(result);
  }
  public static boolean uniqueOccurrences(int[] arr) {
    Map<Integer,Integer> count = new HashMap<>();
    for(int num:arr){
      count.put(num,count.getOrDefault(num,0)+1);
    }
    System.out.println(count.values());
    HashSet<Integer> number = new HashSet(count.values());
    return count.size() == number.size();
  }
}
