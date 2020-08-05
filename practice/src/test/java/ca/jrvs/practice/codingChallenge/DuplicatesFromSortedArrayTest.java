package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicatesFromSortedArrayTest {

  @Test
  public void testRemoveDuplicates() {
    DuplicatesFromSortedArray dups = new DuplicatesFromSortedArray();
    int[] nums = {1, 1, 3, 4, 6, 7};
    int[] nums2 = {1, 1, 3, 3, 4, 5, 5};
    assertEquals(5, dups.removeDuplicates(nums));
    assertEquals(4, dups.removeDuplicates(nums2));
  }

}
