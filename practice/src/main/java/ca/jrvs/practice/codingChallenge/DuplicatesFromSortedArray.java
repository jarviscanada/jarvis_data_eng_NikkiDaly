package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL : https://www.notion.so/Duplicates-from-Sorted-Array-58a18e7b592c415093d2672fd2b61f49
 */
public class DuplicatesFromSortedArray {

  /**
   * Description : Uses two pointers to remove duplicate integers from a sorted array and returns the length of the new array
   * Big O : O(n)
   * Justification : traverses the array once
   */
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }

}
