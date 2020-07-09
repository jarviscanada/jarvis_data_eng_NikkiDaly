package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidPalindromeTest {

  @Test
  public void validPalindrome() {
    ValidPalindrome validPalindrome = new ValidPalindrome();
    assertEquals(true, validPalindrome.validPalindromeTwoPointers("aba"));
    assertEquals(true, validPalindrome.validPalindromeTwoPointers("race car"));
    assertEquals(true, validPalindrome.validPalindromeTwoPointers(""));
    assertEquals(false, validPalindrome.validPalindromeTwoPointers("hey there"));
  }

  @Test
  public void validPalindromeRecursive() {
    ValidPalindrome validPalindrome = new ValidPalindrome();
    assertEquals(true, validPalindrome.vaildPalindromeRecursive("aba"));
    assertEquals(true, validPalindrome.vaildPalindromeRecursive("race car"));
    assertEquals(true, validPalindrome.vaildPalindromeRecursive(""));
    assertEquals(false, validPalindrome.vaildPalindromeRecursive("hey there"));
  }

}
