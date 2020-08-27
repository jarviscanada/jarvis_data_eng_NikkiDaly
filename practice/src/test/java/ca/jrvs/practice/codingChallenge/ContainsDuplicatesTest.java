package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicatesTest {

  private ContainsDuplicates containsDuplicates;
  private int[] nums;
  private int[] nums2;

  @Before
  public void setup() {
    containsDuplicates = new ContainsDuplicates();
    nums = new int[]{1, 6, 2, 7, 3, 6};
    nums2 = new int[]{3, 5, 1, 7, 8, 9};
  }

  @Test
  public void testFirstMethod() {
    assertEquals(true, containsDuplicates.containsDups(nums));
    assertEquals(false, containsDuplicates.containsDups(nums2));
  }

  @Test
  public void testSecondMethod() {
    assertEquals(true, containsDuplicates.containsDupsSet(nums));
    assertEquals(false, containsDuplicates.containsDupsSet(nums2));
  }

}
