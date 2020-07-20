package ca.jrvs.practice.codingChallenge;

/**
 * ticket: https://www.notion.so/Sample-Check-if-a-number-is-even-or-odd-234dd289a4154a5fba8831d7bc569b91
 */
public class EvenOdd {

  /**
   * Description : Determine if the number is even or odd using modulo
   * Big O : O(1)
   * Justification : It's a single modulo operation
   */
  public String evenOddMod(int i) {
    return i % 2 == 0 ? "Even" : "Odd";
  }

  /**
   * Description : Determine if the number is even or odd using bit operation
   * Big O : O(1)
   * Justification : It's a single XOR operation
   */
  public String evenOddBit(int i) {
    return (i ^ 1) == (i + 1) ? "Even" : "Odd";
  }

}
