package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringContainsDigitsTest {

  @Test
  public void javaApiTest() {
    StringContainsDigits scd = new StringContainsDigits();
    assertEquals(true, scd.stringOnlyDigitsJavaApi("1234"));
    assertEquals(false, scd.stringOnlyDigitsJavaApi("1234, 5678"));
  }

  @Test
  public void regexTest() {
    StringContainsDigits scd = new StringContainsDigits();
    assertEquals(true, scd.stringOnlyDigitsRegex("1234"));
    assertEquals(false, scd.stringOnlyDigitsRegex("1234, 5678"));
  }

  @Test
  public void asciiTest() {
    StringContainsDigits scd = new StringContainsDigits();
    assertEquals(true, scd.stringOnlyDigitsAscii("1234"));
    assertEquals(false, scd.stringOnlyDigitsAscii("1234, 5678"));
  }

}
