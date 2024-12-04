package Arrays;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.main.java.Arrays.MaximumConsecutiveSubsequence;

public class MaximumConseutiveSubsequenceTest {
  MaximumConsecutiveSubsequence obj;

  @Before
  public void setup(){
    obj = new MaximumConsecutiveSubsequence();
  }
  @Test
  public void test1(){
    int[] arr = {45,5,2,3,1,4,6,7,8,15,13,10,16,12,11,14,23,56,78};
    int result = obj.maximumConsecutiveSubsequence(arr);
    Assert.assertEquals(8,result);


  }

  @Test
  public void test2(){
    int[] arr = {1,2,3,5,6,7,8,9,10};
    int result = obj.maximumConsecutiveSubsequence(arr);
    Assert.assertEquals(6,result);
  }

  @Test
  public void test3(){
    int[] arr = {1,3,5,7,9,11,21,22,24,23,26,25};
    int result = obj.maximumConsecutiveSubsequence(arr);
    Assert.assertEquals(6,result);
  }
}
