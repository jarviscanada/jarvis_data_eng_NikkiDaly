package ca.jrvs.practice.codingChallenge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RotateStringTest {

  @Test
  public void rotateStringTest() {
    RotateString rotateString = new RotateString();
    assertEquals(true, rotateString.rotateString("abcde", "bcdea"));
    assertEquals(false, rotateString.rotateString("abcde", "bdeca"));
    assertEquals(false, rotateString.rotateString("aa", "a"));
  }

}
