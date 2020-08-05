package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL : https://www.notion.so/Merge-Sorted-Array-8fb067a3f2a844dd814288718b05b7a7
 */
public class MergeSortedArray {

  /**
   * Description : Merges two sorted arrays
   * Big O : O(nlogn)
   * Justification : Uses merge sort which runs in O(nlogn)
   */
  public int[] mergeSortedArray(int[] nums1, int[] nums2) {
    int i = 0, j = 0, k = 0;
    int[] merged = new int[nums1.length + nums2.length];
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] <= nums2[j]) {
        merged[k++] = nums1[i++];
      } else {
        merged[k++] = nums2[j++];
      }
    }
    while (i < nums1.length) {
      merged[k++] = nums1[i++];
    }
    while (j < nums2.length) {
      merged[k++] = nums2[j++];
    }
    return merged;
  }

}
