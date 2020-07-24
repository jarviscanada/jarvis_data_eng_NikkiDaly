package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import ca.jrvs.practice.codingChallenge.MiddleOfLinkedList.Node;
import org.junit.Test;

public class MiddleNodeTest {

  @Test
  public void middleNode() {
    Node root = new Node(1);
    root.next = new Node(2);
    root.next.next = new Node(3);
    root.next.next.next = new Node(4);
    MiddleOfLinkedList middle = new MiddleOfLinkedList();
    assertEquals(3, middle.middleOfList(root).val);
    root.next.next.next.next = new Node(5);
    assertEquals(3, middle.middleOfList(root).val);
  }

}
