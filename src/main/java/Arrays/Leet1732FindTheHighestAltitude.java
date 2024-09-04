package Arrays;

public class Leet1732FindTheHighestAltitude {
  public static void main(String a[]) {
    int gain[] = {-4, -3, -2, -1, 4, 3, 2};
    int soFarMax = 0;
    int temp = 0;
    for (int i = 0; i < gain.length; i++) {
      temp = temp + gain[i];
      if (temp > soFarMax) {
        soFarMax = temp;
      }
    }
    System.out.println(soFarMax);
    ;
  }
}
