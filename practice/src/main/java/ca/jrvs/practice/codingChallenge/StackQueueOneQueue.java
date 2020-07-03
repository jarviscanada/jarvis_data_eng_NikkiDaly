package ca.jrvs.practice.codingChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueueOneQueue {

  Queue<Integer> q1;

  /**
   * Initialize stack using 1 queue
   */
  StackQueueOneQueue() {
    q1 = new LinkedList<Integer>();
  }

  /**
   * Description : Pushes element onto stack
   * Big O : O(n)
   * Justification : removes n elements and adds n+1
   */
  public void push(int x) {
    q1.add(x);
    int size = q1.size();
    while (size > 1) {
      q1.add(q1.remove());
      size--;
    }
  }

  /**
   * Description : pops element off of stack
   * Big O : O(1)
   * Justification : Simply removes a single element from stack
   */
  public int pop() {
    if (!q1.isEmpty()) {
      return q1.remove();
    } else {
      return -1;
    }
  }

}
