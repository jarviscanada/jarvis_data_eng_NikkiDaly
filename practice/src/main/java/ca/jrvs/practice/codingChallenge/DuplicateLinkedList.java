package ca.jrvs.practice.codingChallenge;

import ca.jrvs.practice.dataStructure.list.LinkedJList;
import ca.jrvs.practice.dataStructure.list.LinkedJList.Node;
import java.util.HashSet;
import java.util.Set;

public class DuplicateLinkedList {

  public void removeDuplicates(Node head) {
    Node node = head;
    Node prevNode = null;
    Set<Object> set = new HashSet<>();
    while (node != null && node.next != null) {
      if(!set.add(node.element)){
        prevNode.next = node.next;
      } else{
        prevNode = node;
      }
      node = node.next;
    }
  }
}
