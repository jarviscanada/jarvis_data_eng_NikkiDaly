package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL: https://www.notion.so/LinkedList-Cycle-1e05e1eaae1a401fb2190a94f1104c82
 */
public class LinkedListCycle {

  /**
   * Node definition for single linked list
   */
  public static class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
  }

  /**
   * Description : Returns true if there is a cycle in the linked list, false otherwise
   * Big O : O(n)
   * Justification : Passes through list once
   */
  public Boolean linkedListCycle(Node root) {
    if (root == null || root.next == null) {
      return false;
    }
    Node ptr1 = root;
    Node ptr2 = root.next;
    while (ptr1 != ptr2) {
      if (ptr2 == null || ptr2.next == null) {
        return false;
      }
      ptr1 = ptr1.next;
      ptr2 = ptr2.next.next;
    }
    return true;
  }
}
