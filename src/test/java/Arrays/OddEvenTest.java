package Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddEvenTest {
  OddEven obj;

  @Before
  public void setup(){
    obj = new OddEven();
  }

  @Test
  public void test1(){
    int[] arr = {1,2,3,4,5};
    String[] result = obj.oddEven(arr);
    String[] expected = {"odd","even","odd","even","odd"};
    Assert.assertEquals(result,expected);
  }

  @Test
  public void test2(){
    int[] arr = {5,4,3,2,1};
    String[] result = obj.oddEven(arr);
    String[] expected = {"odd","even","odd","even","odd"};
    Assert.assertEquals(result,expected);
  }
}
