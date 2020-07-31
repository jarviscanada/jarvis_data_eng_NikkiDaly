package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoSumTest {

  @Test
  public void twoSumBruteForce() {
    TwoSum twoSum = new TwoSum();
    int[] testArray = new int[]{1, 2, 3, 4};
    int[] answer = twoSum.twoSumBruteForce(testArray, 7);
    assertEquals("First index should be 2", 2, answer[0]);
    assertEquals("Second index should be 3", 3, answer[1]);
  }


  @Test
  public void twoSumSorted() {
    TwoSum twoSum = new TwoSum();
    int[] testArray = new int[]{3, 2, 4, 1};
    int[] answer = twoSum.twoSumSorted(testArray, 7);
    assertEquals("First index should be 2", 2, answer[0]);
    assertEquals("Second index should be 3", 3, answer[1]);
  }

  @Test
  public void twoSumHashMap() {
    TwoSum twoSum = new TwoSum();
    int[] testArray = new int[]{1, 2, 3, 4};
    int[] answer = twoSum.twoSumBruteForce(testArray, 7);
    assertEquals("First index should be 2", 2, answer[0]);
    assertEquals("Second index should be 3", 3, answer[1]);
  }

}
