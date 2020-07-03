package ca.jrvs.practice.codingChallenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Ticket URL: https://www.notion.so/Implement-Stack-using-Queue-21b6642d302a41bf9be3dbb27c0c6bf4
 */
public class StackQueueTwoQueues {

  Queue<Integer> q1;
  Queue<Integer> q2;
  int top;

  /**
   * Initialize two queues to implement a stack
   */
  StackQueueTwoQueues() {
    q1 = new LinkedList<Integer>();
    q2 = new LinkedList<Integer>();
  }

  /**
   * Description : pushes element onto the stack
   * Big O : O(1)
   * Justification : Adds single element to stack
   */
  public void push(int x) {
    q1.add(x);
    top = x;
  }

  /**
   * Description: pops element off of stack
   * Big O : O(n)
   * Justification : dequeues n elements from q1 and enqueues n-1 elements to q2
   */
  public int pop() {
    while (q1.size() > 1) {
      top = q1.remove();
      q2.add(top);
    }
    if (!q1.isEmpty()) {
      int n = q1.remove();
      Queue<Integer> temp = q1;
      q1 = q2;
      q2 = temp;
      return n;
    }
    return -1;
  }
}
