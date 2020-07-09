package ca.jrvs.practice.dataStructure.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedJListTest {

  @Test
  public void add() {
    JList<String> list = new LinkedJList<>();
    list.add("first");
    assertEquals(list.get(0), "first");
  }

  @Test
  public void toArray() {
    JList<String> list = new LinkedJList<>();
    list.add("first");
    list.add("second");
    assertEquals(list.toArray(), new String[]{"first", "second"});
  }

  @Test
  public void size() {
    JList<String> list = new LinkedJList<>();
    assertEquals(list.size(), 0);
    list.add("first");
    assertEquals(list.size(),1);
  }

  @Test
  public void isEmpty() {
    JList<String> list = new LinkedJList<>();
    assertEquals(list.isEmpty(), true);
    list.add("first");
    assertEquals(list.isEmpty(), false);
  }

  @Test
  public void indexOf() {
    JList<String> list = new LinkedJList<>();
    assertEquals(list.indexOf("first"), -1);
    list.add("first");
    assertEquals(list.indexOf("first"), 0);
  }

  @Test
  public void contains() {
    JList<String> list = new LinkedJList<>();
    assertEquals(list.contains("first"), false);
    list.add("first");
    assertEquals(list.contains("first"), true);
  }

  @Test
  public void get() {
    JList<String> list = new LinkedJList<>();
    list.add("first");
    assertEquals(list.get(0), "first");
  }

  @Test
  public void remove() {
    JList<String> list = new LinkedJList<>();
    list.add("first");
    assertEquals(list.remove(0), "first");
  }

  @Test
  public void clear() {
    JList<String> list = new LinkedJList<>();
    list.add("first");
    list.clear();
    assertEquals(list.size(), 0);
  }
}