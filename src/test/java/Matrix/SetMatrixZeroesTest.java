package Matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetMatrixZeroesTest {
  SetMatrixZeroes obj;

  @Before
  public void setUp() {
    obj = new SetMatrixZeroes();
  }

  @Test
  public void test1() {
    int[][] arr = {{1, 2, 3, 0}, {4, 5, 0, 6}, {7, 8, 9, 2}};
    int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {7, 8, 0, 0}};

    int[][] result = obj.setMatrixZero(arr);

    Assert.assertArrayEquals(result, expected);
  }
}
