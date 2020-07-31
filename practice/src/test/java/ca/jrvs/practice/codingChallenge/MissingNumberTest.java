package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {

  private MissingNumber mn;
  private int[] arr;

  @Before
  public void setup() {
    mn = new MissingNumber();
    arr = new int[]{3, 0, 2, 5, 1};
  }

  @Test
  public void firstApproachTest() {
    assertEquals(4, mn.firstApproach(arr));
  }

  @Test
  public void secondApproachTest() {
    assertEquals(4, mn.secondApproach(arr));
  }

  @Test
  public void thirdApproachTest() {
    assertEquals(4, mn.thirdApproach(arr));
  }

}
