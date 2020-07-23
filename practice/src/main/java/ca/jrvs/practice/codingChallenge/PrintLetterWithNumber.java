package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL : https://www.notion.so/Print-letter-with-number-b16b5f50d0dc4e3ba24a15552b6cc28a
 */
public class PrintLetterWithNumber {

  /**
   * Description : Prints the ASCII letter index after each character.
   * Big O : O(n)
   * Justification : Loops through all characters in the string
   */
  public String printLetterWithNumber(String str) {
    char[] chars = str.toCharArray();
    String output = "";
    for (char c : chars) {
      int i = c;
      if (i >= 'a' && i <= 'z') {
        output = output + c + (i - 96);
      } else if (i >= 'A' && i <= 'Z') {
        output = output + c + (i - 38);
      } else {
        throw new IllegalArgumentException("String contains non ASCII characters");
      }
    }
    return output;
  }

}
