package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveElementTest {

  @Test
  public void removeElementTest() {
    RemoveElement removeElement = new RemoveElement();
    int[] input = new int[]{1, 3, 4, 2, 6};
    assertEquals(4, removeElement.removeElement(input, 2));
  }

}
