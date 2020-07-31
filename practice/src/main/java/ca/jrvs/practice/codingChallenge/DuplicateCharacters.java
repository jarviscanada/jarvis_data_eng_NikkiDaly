package ca.jrvs.practice.codingChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Ticket URL: https://www.notion.so/Duplicate-Characters-f76e12350448482ab5591df34e8a59b8
 */
public class DuplicateCharacters {

  /**
   * Description: Returns an array of repeated characters in a string
   * Big O : O(n)
   * Justification : Iterates through every character of the string once
   */
  public Character[] findDuplicateCharacters(String str) {
    List<Character> dups = new ArrayList<>();
    Set<Character> chars = new HashSet<>();
    str = str.toLowerCase().replaceAll("\\s","");
    str.chars().forEach(e -> {
      char c = (char) e;
      boolean added = chars.add(c);
      if (!added && !dups.contains(c)) {
        dups.add(c);
      }
    });
    return dups.toArray(new Character[dups.size()]);
  }

}
