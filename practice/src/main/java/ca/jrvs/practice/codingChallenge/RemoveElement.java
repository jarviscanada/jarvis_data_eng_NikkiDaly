package ca.jrvs.practice.codingChallenge;

/**
 * ticket URL : https://www.notion.so/Remove-Element-5e48e7fd93254eb39a417ba99a6a0b8c
 */
public class RemoveElement {

  /**
   * Description : Remove all instances of a given value from a given an array in-place and return the new length of the array
   * Big O : O(n)
   * Justification : Iterates through array once
   */
  public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }

}
