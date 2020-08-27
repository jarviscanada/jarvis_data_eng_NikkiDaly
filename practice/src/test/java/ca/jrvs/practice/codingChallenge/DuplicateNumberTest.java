package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DuplicateNumberTest {

  private DuplicateNumber duplicateNumber;
  private Integer[] input;
  private Integer[] badInput;

  @Before
  public void setup() {
    duplicateNumber = new DuplicateNumber();
    input = new Integer[]{3, 1, 3, 2, 4};
    badInput = new Integer[]{2, 4, 1, 3, 0};
  }

  @Test
  public void findDuplicateNumberTest() {
    assertEquals(3, duplicateNumber.findDuplicateNumber(input));
    assertEquals(-1, duplicateNumber.findDuplicateNumber(badInput));
  }

  @Test
  public void findDuplicateNumberFastTest() {
    assertEquals(3, duplicateNumber.findDuplicateNumberFast(input));
    assertEquals(-1, duplicateNumber.findDuplicateNumberFast(badInput));
  }

}
