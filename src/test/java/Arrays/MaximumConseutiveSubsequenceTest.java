package Arrays;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumConseutiveSubsequenceTest {
  @Test
  public void test1(){
    int[] arr = {45,5,2,3,1,4,6,7,8,15,13,10,16,12,11,14,23,56,78};
    int actual = src.main.java.Arrays.MaximumConsecutiveSubsequence.maximumConsecutiveSubsequence(arr);
    Assert.assertEquals(8,actual);


  }

  @Test
  public void test2(){
    int[] arr = {1,2,3,5,6,7,8,9,10};
    int actual = src.main.java.Arrays.MaximumConsecutiveSubsequence.maximumConsecutiveSubsequence(arr);
    Assert.assertEquals(6,actual);
  }

  @Test
  public void test3(){
    int[] arr = {1,3,5,7,9,11,21,22,24,23,26,25};
    int actual = src.main.java.Arrays.MaximumConsecutiveSubsequence.maximumConsecutiveSubsequence(arr);
    Assert.assertEquals(6,actual);
  }
}
