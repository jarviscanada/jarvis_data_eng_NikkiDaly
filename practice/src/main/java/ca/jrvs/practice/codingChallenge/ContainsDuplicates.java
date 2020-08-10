package ca.jrvs.practice.codingChallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * Ticker URL : https://www.notion.so/Contains-Duplicate-86260db7a5a848159ded2344774359d5
 */
public class ContainsDuplicates {

  /**
   * Description : Checks if an array of integers contains duplicates
   * Big O : O(n^2)
   * Justification : Nested loop
   */
  public boolean containsDups(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
      for (int j = 0; j < i; ++j) {
        if (nums[j] == nums[i]) return true;
      }
    }
    return false;
  }

  /**
   * Description : Checks if an array of integers contains duplicates using a set
   * Big O : O(n)
   * Justification : Compute a search and insert n times
   */
  public boolean containsDupsSet(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
      if (set.contains(x)) {
        return true;
      }
      set.add(x);
    }
    return false;
  }
}
