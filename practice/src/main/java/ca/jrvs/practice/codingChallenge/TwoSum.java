package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  /**
   * Description : Use brute force to compare each value in array to find two that sum to the target
   * Big O : O(n^2)
   * Justification : Using nested loop for array of size n
   */
  public int[] twoSumBruteForce(int[] nums, int target) {
    for (int i = 0;  i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i,j};
        }
      }
    }
    return null;
  }

  /**
   * Description : Using Java's sorting algorithm we can find the index more efficiently
   * Big O : O(nlogn)
   * Justification : Java's sorting algo takes O(nlogn)
   */
  public int[] twoSumSorted(int[] nums, int target) {
    int[] sortedNums = nums.clone();
    Arrays.sort(sortedNums);
    int index = 0;
    int offset = nums.length - 1;
    while (index < offset) {
      int sum = sortedNums[index] + sortedNums[offset];
      if (sum == target) {
        return new int[]{ index , offset };
      } else if (sum < target) {
        ++index;
      } else if (sum > target) {
        offset--;
      }
    }
    return null;
  }

  /**
   * Description : Use a hashmap to find two indices that sum to target in O(n) time
   * Big O : O(n)
   * Justification : Single loop through all values in array
   */
  public int[] twoSumHashMap(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[] {i, map.get(complement)};
      }
    }
    return null;
  }

}
