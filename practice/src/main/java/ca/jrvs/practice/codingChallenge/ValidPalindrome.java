package ca.jrvs.practice.codingChallenge;

public class ValidPalindrome {

  /**
   * Description : Returns true if string is a palindrome
   * Big O : O(n)
   * Justification : loops through half of the length of the string
   * ( O(n/2) is same set of functions as O(n) )
   */
  public Boolean validPalindromeTwoPointers(String str) {
    str = str.toLowerCase();
    str = str.replaceAll("\\s","");
    int n = str.length()-1;
    for (int i = 0; i < str.length()/2; i++) {
      int j = n - i;
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Description : Returns true if string is a palindrome
   * Big O : O(n)
   * Justification : recursion occurs for every pair which is O(n/2)
   * ( O(n/2) is same set of functions as O(n) )
   */
  public Boolean vaildPalindromeRecursive(String str) {
    str = str.toLowerCase();
    str = str.replaceAll("\\s","");
    if (str.length() == 1 || str.length() == 0) {
      return true;
    } else if (str.length() == 2) {
      return str.charAt(0) == str.charAt(1);
    } else {
      return (str.charAt(0) == str.charAt(str.length()-1) &&
          vaildPalindromeRecursive(str.substring(1, str.length()-1)));
    }
  }

}
