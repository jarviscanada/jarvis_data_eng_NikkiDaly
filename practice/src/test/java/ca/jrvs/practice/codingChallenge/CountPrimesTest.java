package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountPrimesTest {

  @Test
  public void countPrimesTest() {
    CountPrimes countPrimes = new CountPrimes();
    assertEquals(4, countPrimes.countPrimes(10));
    assertEquals(25, countPrimes.countPrimes(100));
  }

}
