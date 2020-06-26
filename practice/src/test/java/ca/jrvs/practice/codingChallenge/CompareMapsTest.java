package ca.jrvs.practice.codingChallenge;

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
    map1.put(2, "B");
    map1.put(3, "C");

    Map<Integer, String> map2 = new HashMap<Integer, String>();
    map2.put(1, "A");
    map2.put(2, "B");
    map2.put(3, "C");

    Map<Integer, String> map3 = new HashMap<Integer, String>();
    map3.put(1, "test");

    assertEquals(true, compareMaps.compareMaps(map1, map2));
    assertEquals(false, compareMaps.compareMaps(map1, map3));

  }

}
