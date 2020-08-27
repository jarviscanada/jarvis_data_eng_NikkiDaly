package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ca.jrvs.practice.codingChallenge.ReverseLinkedList.Node;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest {

  private ReverseLinkedList reverseLinkedList;
  private Node root = new Node(1);
  private Node n2 = new Node (2);
  private Node n3 = new Node(3);
  private Node n4 = new Node(4);

  @Before
  public void setup() {
    reverseLinkedList = new ReverseLinkedList();
    root.next = n2;
    root.next.next = n3;
    root.next.next.next = n4;
  }

  @Test
  public void testIterativeApproach() {
    Node newRoot = reverseLinkedList.reverseLinkedListIteratively(root);
    assertEquals(4, newRoot.val);
    assertEquals(3, newRoot.next.val);
    assertEquals(2, newRoot.next.next.val);
    assertEquals(1, newRoot.next.next.next.val);
    assertEquals(null, newRoot.next.next.next.next);
  }

  @Test
  public void testRecursiveApproach() {
    Node newRoot = reverseLinkedList.reverseLinkedListRecursively(root);
    assertEquals(4, newRoot.val);
    assertEquals(3, newRoot.next.val);
    assertEquals(2, newRoot.next.next.val);
    assertEquals(1, newRoot.next.next.next.val);
    assertEquals(null, newRoot.next.next.next.next);
  }

}
