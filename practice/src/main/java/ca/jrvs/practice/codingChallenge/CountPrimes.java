package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL: https://www.notion.so/Count-Primes-1f025cc5c82a46a385ed8ee51a261e05
 */
public class CountPrimes {

  /**
   * Description: Counts the number of prime numbers between 0 and the argument passed to the function
   * Big O: O(n^2)
   * Justification : Nested loop
   */
  public int countPrimes(int num) {
    if (num < 0) {
      throw new IllegalArgumentException("Number cannot be negative");
    }
    if (num == 1 || num == 2) {
      return 0;
    }
    int count = 0;
    for (int i = 3; i < num; i++) {
      boolean prime = true;
      for (int j = 2; j < i/2; j++) {
        if (i%j == 0) {
          prime = false;
          break;
        }
      }
      if (prime) {
        count++;
      }
    }
    return count;
  }

}
