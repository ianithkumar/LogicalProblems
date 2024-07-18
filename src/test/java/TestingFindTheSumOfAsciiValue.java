package test.java;

import main.java.Arrays.FindTheSumOfAsciiValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestingFindTheSumOfAsciiValue {
  private static FindTheSumOfAsciiValue test;

  @Before
  public void setup() {
    test = new FindTheSumOfAsciiValue();
  }


  @Test
  public void testingFindSum() {
    char[] arr1 = {'A', 'B', 'C'};
    char[] arr2 = {'B', 'C'};
    int testAnswer = test.findSumAscii(arr1, arr2);
    Assert.assertEquals(2, testAnswer);
  }
}
