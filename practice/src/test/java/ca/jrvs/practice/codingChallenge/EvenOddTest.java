package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOddTest {

  @Test
  public void evenOddModulo() {
    EvenOdd evenOdd = new EvenOdd();
    assertEquals("Even", evenOdd.evenOddMod(2));
    assertEquals("Odd", evenOdd.evenOddMod(3));
  }

  @Test
  public void evenOddBit() {
    EvenOdd evenOdd = new EvenOdd();
    assertEquals("Even", evenOdd.evenOddBit(2));
    assertEquals("Odd", evenOdd.evenOddBit(3));
  }
}
