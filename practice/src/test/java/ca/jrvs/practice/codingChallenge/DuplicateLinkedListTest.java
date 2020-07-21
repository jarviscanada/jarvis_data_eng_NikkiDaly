package ca.jrvs.practice.codingChallenge;

import ca.jrvs.practice.dataStructure.list.JList;
import ca.jrvs.practice.dataStructure.list.LinkedJList;
import ca.jrvs.practice.dataStructure.list.LinkedJList.Node;
import org.junit.Test;

public class DuplicateLinkedListTest {

  @Test
  public void duplicateLinkedListTest() {
    DuplicateLinkedList dup = new DuplicateLinkedList();
    JList<Integer> list = new LinkedJList<>();
    list.add(3);
    list.add(1);
    list.add(2);
    list.add(3);

  }

}
