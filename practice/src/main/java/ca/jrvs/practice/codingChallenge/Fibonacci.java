package ca.jrvs.practice.codingChallenge;

/**
 * https://www.notion.so/Fibonacci-Number-Climbing-Stairs-6ba6d7c25a7b4f22b096297cec545f04
 */
public class Fibonacci {

  /**
   * Description : Returns the nth fibonacci number using recursion Big O : O(2^n) Justification :
   * The depth of the recursion tree would be n and the numbers of nodes in each row double each
   * time
   */
  public int fib(int n) {
    return (n == 0) ? 0 : (n == 1 || n == 2) ? 1 : fib(n - 1) + fib(n - 2);
  }

  /**
   * Description : Returns the nth fibonacci number using dynamic programming Big O : O(n)
   * Justification : Second part of the function calls fibDynamic at most 2 times (2n) and execution
   * takes a constant time O(1), simplifies to O(n).
   */
  public int fibDynamic(int n) {
    int result;
    int[] memo = new int[n + 1];
    result = (n == 0) ? 0
        : (memo[n] != 0) ? memo[n] : (n == 1 || n == 2) ? 1 : fibDynamic(n - 1) + fibDynamic(n - 2);
    memo[n] = result;
    return result;
  }
}
