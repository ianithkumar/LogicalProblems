package Numbers;
import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisorOfANumber {
  public static void main(String[] args){
    int n = 10;
    List<Integer> result = printAllDivisorOfANumber(n);
    System.out.println(result);
  }

  private static List<Integer> printAllDivisorOfANumber(int n) {
    List<Integer> result = new ArrayList<>();
    for(int i=1;i<n;i++){
      if(n%i==0){
        result.add(i);
      }
    }
    return result;
  }

}
