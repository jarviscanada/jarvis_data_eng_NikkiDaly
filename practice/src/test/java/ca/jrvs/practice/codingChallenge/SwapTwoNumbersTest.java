package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class SwapTwoNumbersTest {

  private SwapTwoNumbers swap;
  private int[] input;

  @Before
  public void setup() {
    swap = new SwapTwoNumbers();
    input = new int[]{1, 2};

  }

  @Test
  public void bitManipulation() {
    int[] output = swap.bitManipulation(input);
    assertEquals(2, output[0]);
    assertEquals(1, output[1]);
    try {
      output = swap.arithmeticsOp(new int[]{1, 2, 3});
      fail();
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }
  }

  @Test
  public void arithmeticOp() {
    int[] output = swap.arithmeticsOp(input);
    assertEquals(2, output[0]);
    assertEquals(1, output[1]);
    try {
      output = swap.arithmeticsOp(new int[]{1, 2, 3});
      fail();
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }
  }

}
