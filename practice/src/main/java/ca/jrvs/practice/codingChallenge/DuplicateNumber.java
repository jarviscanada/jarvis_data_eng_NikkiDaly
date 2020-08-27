package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Ticket URL: https://www.notion.so/Find-the-Duplicate-Number-0091198592b6448593114a0663a7867f
 */
public class DuplicateNumber {

  /**
   * Description : Finds the duplicate number in the array
   * Big O : O(nlog(n))
   * Justification : Collections.sort takes O(nlog(n))
   */
  public int findDuplicateNumber(Integer[] nums) {
    List<Integer> numsList = Arrays.asList(nums);
    Collections.sort(numsList);
    int current = numsList.get(0);
    for (int i = 1; i < numsList.size(); i++) {
      if (numsList.get(i) == current) {
        return current;
      }
      current = numsList.get(i);
    }
    return -1;
  }

  /**
   * Description : Finds the duplicate number in the array
   * Big O : O(n)
   * Justification : Iterate through every element of the array once
   */
  public int findDuplicateNumberFast(Integer[] nums) {
    Set<Integer> numsSet = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (!numsSet.add(nums[i])) {
        return nums[i];
      }
    }
    return -1;
  }

}
