package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import ca.jrvs.practice.dataStructure.list.JList;
import ca.jrvs.practice.dataStructure.list.LinkedJList;
import ca.jrvs.practice.dataStructure.list.LinkedJList.Node;
import org.junit.Test;

public class DuplicateLinkedListTest {

  @Test
  public void duplicateLinkedListTest() {
    DuplicateLinkedList dup = new DuplicateLinkedList();
    Node root = new Node(1);
    root.next = new Node(1);
    root.next.next = new Node(3);
    root.next.next.next = new Node(3);
    dup.removeDuplicates(root);
    assertEquals(3, root.next.element);
    assertEquals(null, root.next.next);
  }

}
