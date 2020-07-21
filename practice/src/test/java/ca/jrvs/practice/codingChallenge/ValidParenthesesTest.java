package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidParenthesesTest {

  @Test
  public void validParentheses() {
    ValidParentheses validParentheses = new ValidParentheses();
    assertEquals(true, validParentheses.validParentheses("{([])}"));
    assertEquals(false, validParentheses.validParentheses("[)"));
    assertEquals(false, validParentheses.validParentheses(")"));
  }

}
