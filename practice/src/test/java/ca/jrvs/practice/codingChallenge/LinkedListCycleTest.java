package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import ca.jrvs.practice.codingChallenge.LinkedListCycle.Node;
import org.junit.Test;

public class LinkedListCycleTest {

  @Test
  public void linkedListCycleTest() {
    LinkedListCycle cycle = new LinkedListCycle();
    Node root = new Node(1);
    assertEquals(false, cycle.linkedListCycle(root));
    root.next = new Node(2);
    root.next.next = new Node(3);
    assertEquals(false, cycle.linkedListCycle(root));
    root.next.next.next = root.next;
    assertEquals(true, cycle.linkedListCycle(root));
  }
}
