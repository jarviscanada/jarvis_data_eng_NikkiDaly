package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;

public class MergeSortedArrayTest {

  @Test
  public void testMergeSortedArray() {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    int[] nums1 = {1, 2, 4, 6};
    int[] nums2 = {1, 4, 6, 9};
    int[] merged = mergeSortedArray.mergeSortedArray(nums1, nums2);
    assertTrue(Arrays.equals(new int[]{1, 1, 2, 4, 4, 6, 6, 9}, merged));
  }

}
