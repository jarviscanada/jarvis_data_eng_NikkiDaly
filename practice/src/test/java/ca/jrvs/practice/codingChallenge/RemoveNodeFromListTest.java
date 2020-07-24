package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import ca.jrvs.practice.codingChallenge.RemoveNodeFromList.Node;
import org.junit.Test;

public class RemoveNodeFromListTest {

  @Test
  public void removeNodeTest() {
    Node root = new Node(1);
    root.next = new Node(2);
    root.next.next = new Node(3);
    root.next.next.next = new Node(4);
    RemoveNodeFromList rm = new RemoveNodeFromList();
    rm.removeNode(root, 2);
    assertEquals(3, root.next.val);
    rm.removeNode(root, 1);
    assertEquals(4, root.next.val);
  }
}
