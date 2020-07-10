package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidAnagramTest {

  @Test
  public void validAnagramSorted() {
    ValidAnagram validAnagram = new ValidAnagram();
    assertEquals(true, validAnagram.validAnagramSorting("hello", "ohlel"));
    assertEquals(true, validAnagram.validAnagramSorting("", ""));
    assertEquals(false, validAnagram.validAnagramSorting("hello", "hey"));
  }

  @Test
  public void validAnagramModified() {
    ValidAnagram validAnagram = new ValidAnagram();
    assertEquals(true, validAnagram.validAnagramModified("hello", "ohlel"));
    assertEquals(true, validAnagram.validAnagramModified("", ""));
    assertEquals(false, validAnagram.validAnagramModified("hello", "hey"));
  }

}
