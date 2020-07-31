package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class DuplicateCharactersTest {

  @Test
  public void findDuplicateCharactersTest() {
    DuplicateCharacters duplicateCharacters = new DuplicateCharacters();
    List<Character> result = Arrays.asList(duplicateCharacters.findDuplicateCharacters("A black cat"));
    assertEquals(2, result.size());
    assertTrue(result.contains('a'));
    assertTrue(result.contains('c'));
  }

}
