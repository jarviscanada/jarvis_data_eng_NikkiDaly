package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrintLetterWithNumberTest {

  @Test
  public void letterWithNumber() {
    PrintLetterWithNumber pln = new PrintLetterWithNumber();
    String out = pln.printLetterWithNumber("Abcee");
    assertEquals("A27b2c3e5e5", out);
  }

}
