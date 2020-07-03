package ca.jrvs.practice.codingChallenge;

import ca.jrvs.practice.dataStructure.map.JMap;
import java.util.Map;

/**
 * https://www.notion.so/How-to-compare-two-maps-b31fd255599d4e01892aae9660423032
 */
public class CompareMaps {

  /**
   * Description : Compares two HashMaps to see if they are equal to each other Big O Notation :
   * O(n) Justification : Iterates through every key and value to compare
   */
  public <K, V> boolean compareMaps(Map<K, V> m1, Map<K, V> m2) {
    return m1.equals(m2);
  }

  /**
   * Description : Compare two HashJMaps to see if they are equal to eachother Big O Notation : O(n)
   * Justification : Iterates throuhg every key and value to compare
   */
  public <K, V> boolean compareJMaps(JMap<K, V> m1, JMap<K, V> m2) {
    return m1.equals(m2);
  }
}
