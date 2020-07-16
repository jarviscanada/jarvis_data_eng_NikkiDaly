package ca.jrvs.practice.codingChallenge;

import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ticket URL: https://www.notion.so/Check-if-a-String-contains-only-digits-b205d3f324de4a0a8d85f86eef41f9d8
 */
public class StringContainsDigits {

  /**
   * Description : Uses ASCII to determine if a String only contains digits
   * Big O : O(n)
   * Justification : Iterates through each character in String
   */
  public Boolean stringOnlyDigitsAscii(String str) {
    if (str.length() == 0) {
      return false;
    }
    char[] arr = str.toCharArray();
    for(int i = 0; i < str.length(); i++){
      if(arr[i]<'0'||arr[i]>'9'){
        return false;
      }
    }
    return true;
  }

  /**
   * Description : Uses Java API to determine if a String only contains digits
   * Big O : O(n)
   * Justification : Checks every character in String
   */
  public Boolean stringOnlyDigitsJavaApi(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Description : Uses regex to determine if a String only contains digits
   * Big O :
   * Justification :
   */
  public Boolean stringOnlyDigitsRegex(String str) {
    String regex = "[0-9]+";
    Pattern p = Pattern.compile(regex);
    return p.matcher(str).matches();
  }

}
