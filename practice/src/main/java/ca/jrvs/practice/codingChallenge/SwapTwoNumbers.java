package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL : https://www.notion.so/Swap-two-numbers-64dce260dd684194b4be507a6bd0c6ca
 */
public class SwapTwoNumbers {

  /**
   * Description : Swaps two numbers using bit manipulation
   * Big O : O(1)
   * Justification : Simple arithmetic operations
   */
  public int[] bitManipulation(int[] input) {
    if (input.length != 2) {
      throw new IllegalArgumentException("Input array must be of length 2");
    }
    input[0] = input[0] ^ input[1];
    input[1] = input[0] ^ input[1];
    input[0] = input[0] ^ input[1];
    return input;
  }

  /**
   * Description : Swaps two numbers using arithmetic operations
   * Big O : O(1)
   * Justification : Simple arithmetic operations
   */
  public int[] arithmeticsOp(int[] input) {
    if (input.length != 2) {
      throw new IllegalArgumentException("Input array must be of length 2");
    }
    input[0] = input[0] + input[1];
    input[1] = input[0] - input[1];
    input[0] = input[0] - input[1];
    return input;
  }

}
