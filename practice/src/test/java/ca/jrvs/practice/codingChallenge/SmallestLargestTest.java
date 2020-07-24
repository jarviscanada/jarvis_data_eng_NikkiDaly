package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SmallestLargestTest {

  private FindSmallestLargest findSmallestLargest;
  private Integer[] nums;

  @Before
  public void setup() {
    nums = new Integer[]{1, 3, 2, 7, 9, 0};
    findSmallestLargest = new FindSmallestLargest();
  }

  @Test
  public void firstMethodTest() {
    int[] ans = findSmallestLargest.firstMethod(nums);
    assertEquals(0, ans[0]);
    assertEquals(9, ans[1]);
  }

  @Test
  public void secondMethodTest() {
    int[] ans = findSmallestLargest.secondMethod(nums);
    assertEquals(0, ans[0]);
    assertEquals(9, ans[1]);
  }

  @Test
  public void thirdMethodTest() {
    int[] ans = findSmallestLargest.thirdMethod(nums);
    assertEquals(0, ans[0]);
    assertEquals(9, ans[1]);
  }


}
