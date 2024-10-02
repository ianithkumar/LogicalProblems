package Arrays;

import Numbers.CheckPrime;

public class SumOfAllPrimeNumberExceptLargestPrimeNumber {
  public static void main(String[] args){
    int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13};    //2+3+5+7+11+13 = 41
    System.out.println(sumOfAllPrimeNumberExceptLargestPrimeNumber(arr));
  }

  private static int sumOfAllPrimeNumberExceptLargestPrimeNumber(int[] arr) {
    int sum = 0;
    int largestPrime = 0;
    for(int num:arr){
      if(CheckPrime.checkPrime(num)){
        sum+=num;
      }
    }
    sum-=largestPrime;
    return sum;
  }
}
