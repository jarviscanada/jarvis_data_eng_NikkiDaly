package ca.jrvs.practice.codingChallenge;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ticket URL : https://www.notion.so/String-to-Integer-5208c9cc2e294b8bb600dc626087980a
 */
public class StringToInteger {

  /**
   * Description : Returns string as integer value using Java parsing method
   * Big O : O(n)
   * Justification: Integer.parseInt() function takes O(n)
   */
  public Integer stringToInt(String str) {
    str = str.trim().replaceAll("\\s", "");
    int index = 0;
    while (index < str.length()) {
      if (Character.isDigit(str.charAt(index)) || str.charAt(index) == '+'
          || str.charAt(index) == '-') {
        index++;
      } else {
        break;
      }
    }
    str = str.substring(0, index);
    if (str.length() == 0) {
      return 0;
    }
    Integer ans = Integer.parseInt(str);
    return ans;
  }

  /**
   * Description : Uses Ascii character codes and modulus
   * Big O : O(n)
   * Justification : Must loop through all n characters of string
   */
  public Integer stringToIntAscii(String str) {
    if (str == null || str.length() == 0) {
      return 0;
    }

    boolean isNegative = false;
    int index = 0;
    int ans = 0;

    while (index < str.length() && str.charAt(index) == ' ') {
      index++;
    }

    if (index < str.length() && (str.charAt(index) == '-' || str.charAt(index) == '+')) {
      isNegative = (str.charAt(index) == '-');
      index++;
    }

    while (index < str.length() && Character.isDigit(str.charAt(index))) {
      int lastDigit = str.charAt(index++) - '0';
      if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10
          && lastDigit > Integer.MAX_VALUE % 10)) {
        return (isNegative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }
      ans = ans * 10 + lastDigit;
    }
    return isNegative ? ans * (-1) : ans;
  }
}
