package DynamicProgramming;

public class BottomUpFibonacci {
  public static void main(String[] a){
    int num = 6;
    System.out.println(bottomUpFibonacci(num));
  }
  private static int bottomUpFibonacci(int num){
    int[] result = new int[num+1];

    result[0] = 0;
    result[1] = 1;

    for(int i=2;i<=num;i++){
      result[i] = result[i-1]+result[i-2];
    }

    return result[num];
  }
}
