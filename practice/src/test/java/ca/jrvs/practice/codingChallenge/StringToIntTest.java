package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntTest {

  @Test
  public void stringToIntParse() {
    StringToInteger stringToInteger = new StringToInteger();
    assertEquals((Integer) (-42), stringToInteger.stringToInt("-42"));
    assertEquals((Integer) 42, stringToInteger.stringToInt("42"));
    assertEquals((Integer) 0, stringToInteger.stringToInt("nikki nikki"));
    assertEquals((Integer) 123, stringToInteger.stringToInt("123 nikki"));
  }

  @Test
  public void stringToIntAscii() {
    StringToInteger stringToInteger = new StringToInteger();
    assertEquals((Integer) (-42), stringToInteger.stringToIntAscii("-42"));
    assertEquals((Integer) 42, stringToInteger.stringToIntAscii("42"));
    assertEquals((Integer) 0, stringToInteger.stringToIntAscii("nikki nikki"));
    assertEquals((Integer) 123, stringToInteger.stringToIntAscii("123 nikki"));
  }

}
