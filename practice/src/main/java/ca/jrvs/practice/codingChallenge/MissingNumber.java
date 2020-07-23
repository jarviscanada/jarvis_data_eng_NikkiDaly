package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

/**
 * Ticket URL : https://www.notion.so/Missing-Number-28be42b79b044b6d8b091f82eb46ba0f
 */
public class MissingNumber {

  /**
   * Description : Find the missing number from the array by comparing the expected sum of consecutive numbers and the actual sum
   * Big O : O(n)
   * Justification : Sums n+1 values and n values
   */
  public int firstApproach(int[] arr) {
    int expectedSum = IntStream.rangeClosed(0, arr.length).sum();
    int actualSum = Arrays.stream(arr).sum();
    return expectedSum - actualSum;
  }

  /**
   * Description : Find the missing number from the array by checking the hashset for each value
   * Big O : O(n)
   * Justification : Iterates through array of length n twice
   */
  public int secondApproach(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : arr) {
      set.add(i);
    }
    for (int j = 0; j < arr.length+1; j++) {
      if (!set.contains(j)) {
        return j;
      }
    }
    return -1;
  }

  /**
   * Description : Find the missing number from the array using Gauss' formula
   * Big O : O(n)
   * Justification : Stream sum iterates through array of length n
   */
  public int thirdApproach(int[] arr) {
    int expectedSum = (arr.length*(arr.length+1))/2;
    int actualSum = Arrays.stream(arr).sum();
    return expectedSum - actualSum;
  }

}
