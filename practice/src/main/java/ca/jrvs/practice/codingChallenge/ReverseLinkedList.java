package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL : https://www.notion.so/Reverse-Linked-List-e846895ff790484e9937e6ee172a3069
 */
public class ReverseLinkedList {

  public static class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
  }

  /**
   * Description : Reverses a linked list iteratively
   * Big O : O(n)
   * Justification : Iterates through linked list once
   */
  public Node reverseLinkedListIteratively(Node root) {
    Node current = root;
    Node prev = null;
    while (current != null) {
      Node next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  /**
   * Description : Reverses a linked list recursively
   * Big O : O(n)
   * Justification : Calls the function n times
   */
  public Node reverseLinkedListRecursively(Node root) {
    if (root == null || root.next == null) {
      return root;
    }
    Node node = reverseLinkedListRecursively(root.next);
    root.next.next = root;
    root.next = null;
    return node;
  }

}
