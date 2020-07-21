package ca.jrvs.practice.codingChallenge;

import java.util.Stack;

/**
 * Ticket URL : https://www.notion.so/Implement-Queue-using-Stacks-c1902bc99f4943e1a0dde8070c59bdd0
 */
public class QueueStack {

  public interface BasicQueue<E> {

    void enqueue(E element);

    E dequeue();
  }

  public static class TwoStacksQueue implements BasicQueue {

    Stack<Object> s1 = new Stack<Object>();
    Stack<Object> s2 = new Stack<Object>();

    /**
     * Description : adds the element x onto the queue Big O : O(n) Justification : Adds all
     * elements n onto queue and then back on other queue
     */
    @Override
    public void enqueue(Object element) {
      while (!s1.empty()) {
        s2.push(s1.pop());
      }
      s1.push(element);
      while (!s2.empty()) {
        s1.push(s2.pop());
      }
    }

    /**
     * Description : Removes element from front of the queue Big O : O(1) Justification : Removes
     * one element from queue
     */
    @Override
    public Object dequeue() {
      if (!s1.empty()) {
        Object element = s1.peek();
        s1.pop();
        return element;
      }
      return -1;
    }
  }

  public static class QueueStackAmortized implements BasicQueue {

    Stack<Object> s1 = new Stack<Object>();
    Stack<Object> s2 = new Stack<Object>();

    /**
     * Decription : Adds element x onto queue
     * Big O : O(1)
     * Justification : inserts single element
     */
    @Override
    public void enqueue(Object element) {
      s1.push(element);
    }

    /**
     * Description : Removes element from front of queue
     * Big O : O(1) (Amortized)
     * Justification : O(1) to pop one item from stack, if the stack is empty you
     * need to push all the values which results in O(n) for worst case
     */
    @Override
    public Object dequeue() {
      peek();
      if (!s2.empty()) {
        return s2.pop();
      }
      return -1;
    }

    public Object peek() {
      if (!s1.empty()) {
        if (s2.empty()) {
          while (!s1.empty()) {
            s2.push(s1.pop());
          }
        }
        return s2.peek();
      } else {
        return -1;
      }
    }
  }

}
