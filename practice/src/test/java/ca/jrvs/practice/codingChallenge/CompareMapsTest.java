package ca.jrvs.practice.codingChallenge;

import ca.jrvs.practice.dataStructure.map.HashJMap;
import ca.jrvs.practice.dataStructure.map.JMap;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompareMapsTest {

  @Test
  public void compareMaps() {
    CompareMaps compareMaps = new CompareMaps();
    Map<Integer, String> map1 = new HashMap<Integer, String>();
    map1.put(1, "A");

    Map<Integer, String> map2 = new HashMap<Integer, String>();
    map2.put(1, "A");

    Map<Integer, String> map3 = new HashMap<Integer, String>();
    map3.put(2, "test");

    assertEquals(true, compareMaps.compareMaps(map1, map2));
    assertEquals(false, compareMaps.compareMaps(map1, map3));

  }

  @Test
  public void compareJMaps() {
    CompareMaps compareMaps = new CompareMaps();
    JMap<Integer, String> map1 = new HashJMap<>();
    map1.put(1, "A");

    JMap<Integer, String> map2 = new HashJMap<>();
    map2.put(1, "A");

    JMap<Integer, String> map3 = new HashJMap<>();
    map3.put(2, "test");

    assertEquals(true, compareMaps.compareJMaps(map1, map2));
    assertEquals(false, compareMaps.compareJMaps(map1, map3));
  }
}
