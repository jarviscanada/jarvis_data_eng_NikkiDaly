package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Ticket URL: https://www.notion.so/Find-Largest-Smallest-bfe92f64c61445248483317506d0e3e3
 */
public class FindSmallestLargest {

  /**
   * Description : Returns the largest and smallest number in the array using one for loop
   * Big O : O(n)
   * Justification : Iterates through the array of length n once
   */
  public int[] firstMethod(Integer[] nums) {
    Integer largest = 0;
    Integer smallest = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largest) {
        largest = nums[i];
      }
      if (nums[i] < smallest) {
        smallest = nums[i];
      }
    }
    return new int[]{smallest, largest};
  }

  /**
   * Description : Returns the largest and smallest number in the array using stream API
   * Big O : 
   * Justification :
   */
  public int[] secondMethod(Integer[] nums) {
    Integer smallest = Arrays.stream(nums).min(Integer::compare).get();
    Integer largest = Arrays.stream(nums).max(Integer::compare).get();
    return new int[]{smallest, largest};
  }

  /**
   * Description :
   * Big O :
   * Justification :
   * @param nums
   */
  public int[] thirdMethod(Integer[] nums) {
    List<Integer> list = Arrays.asList(nums);
    Integer smallest = Collections.min(list);
    Integer largest = Collections.max(list);
    return new int[]{smallest, largest};
  }

}
