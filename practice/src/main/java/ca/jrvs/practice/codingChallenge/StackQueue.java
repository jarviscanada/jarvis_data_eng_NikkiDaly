package ca.jrvs.practice.codingChallenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Ticket URl: https://www.notion.so/Implement-Stack-using-Queue-21b6642d302a41bf9be3dbb27c0c6bf4
 */
public class StackQueue {

  public interface BasicStack<E> {

    void push(E element);

    E pop();
  }

  public static class DoubleQueueStack<E> implements BasicStack<E> {

    Queue<E> q1 = new LinkedList<>();
    Queue<E> q2 = new LinkedList<>();
    E top;

    /**
     * Description : pushes element onto the stack Big O : O(1) Justification : Adds single element
     * to stack
     */
    @Override
    public void push(E element) {
      q1.add(element);
      top = element;
    }

    /**
     * Description: pops element off of stack Big O : O(n) Justification : dequeues n elements from
     * q1 and enqueues n-1 elements to q2
     */
    @Override
    public E pop() {
      while (q1.size() > 1) {
        top = q1.remove();
        q2.add(top);
      }
      E n = q1.remove();
      Queue<E> temp = q1;
      q1 = q2;
      q2 = temp;
      return n;
    }
  }

  public static class SingleQueueStack<E> implements BasicStack<E> {

    Queue<E> q1 = new LinkedList<>();

    /**
     * Description : Pushes element onto stack Big O : O(n) Justification : removes n elements and
     * adds n+1
     */
    @Override
    public void push(E element) {
      q1.add(element);
      int size = q1.size();
      while (size > 1) {
        q1.add(q1.remove());
        size--;
      }
    }

    /**
     * Description : pops element off of stack Big O : O(1) Justification : Simply removes a single
     * element from stack
     */
    @Override
    public E pop() {
      return q1.remove();
    }
  }

}
