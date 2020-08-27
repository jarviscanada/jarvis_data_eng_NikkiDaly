package ca.jrvs.practice.codingChallenge;

/**
 * Ticket URL: https://www.notion.so/Nth-Node-From-End-of-LinkedList-4fd3a87495734ca99c44e0836f3dd3f4
 */
public class RemoveNodeFromList {

  /**
   * Node definition for single linked list
   */
  public static class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node (int val, Node next) { this.val = val; this.next = next; }
  }

  /**
   * Description: Removes nth node from linked list using two pointers
   * @param root
   * @param n
   * Big O : O(n)
   * Justification : Traverses the list only once
   */
  public void removeNode(Node root, int n) {
    Node ptr1 = root;
    Node ptr2 = root;
    Node prev = null;

    for (int i = 0; i<n+1; i++) {
      ptr1 = ptr1.next;
    }
    while(ptr1 != null) {
      ptr1 = ptr1.next;
      prev = ptr2;
      ptr2 = ptr2.next;
    }
    prev.next = ptr2.next;
    ptr2.next = ptr2.next.next;
  }

}
