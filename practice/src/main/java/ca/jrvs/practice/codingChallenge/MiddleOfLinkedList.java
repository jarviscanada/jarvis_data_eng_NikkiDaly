package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL : https://www.notion.so/Middle-of-the-Linked-List-8e73e67fd5364a1b85be051d5e8db902
 */
public class MiddleOfLinkedList {

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
   * Description : Return middle node in a linked list using two pointers
   * Big O : O(n)
   * Justification : Traverses half the lenght of the list, O(n/2) == O(n)
   */
  public Node middleOfList(Node root) {
    Node ptr1 = root;
    Node ptr2 = root;
    while (ptr1 != null && ptr1.next != null) {
      ptr1 = ptr1.next.next;
      ptr2 = ptr2.next;
    }
    return ptr2;
  }
}
