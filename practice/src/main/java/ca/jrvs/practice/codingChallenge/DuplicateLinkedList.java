package ca.jrvs.practice.codingChallenge;

import ca.jrvs.practice.dataStructure.list.LinkedJList.Node;
import java.util.HashSet;
import java.util.Set;

/**
 * Ticket URL: https://www.notion.so/Duplicate-LinkedList-Node-962e3fd2c1144ec995ba3e31dacb54c2
 */
public class DuplicateLinkedList {

  /**
   * Description : Removes duplicate nodes from a linked list
   * Big O : O(n)
   * Justification : Goes through list of nodes once
   */
  public void removeDuplicates(Node head) {
    Node node = head;
    Node prevNode = null;
    Set<Object> set = new HashSet<>();
    while (node != null) {
      if(!set.add(node.element)){
        prevNode.next = node.next;
      } else{
        prevNode = node;
      }
      node = node.next;
    }
  }
}
