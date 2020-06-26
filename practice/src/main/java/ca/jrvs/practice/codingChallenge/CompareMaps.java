package ca.jrvs.practice.codingChallenge;

import ca.jrvs.practice.dataStructure.map.JMap;
import java.util.Map;

public class CompareMaps {

  public <K, V> boolean compareMaps(Map<K, V> m1, Map<K, V> m2) {
    return m1.equals(m2);
  }

  public <K, V> boolean compareJMaps(JMap<K, V> m1, JMap<K, V> m2) {
    return m1.equals(m2);
  }
}
