package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import ca.jrvs.practice.codingChallenge.StackQueue.DoubleQueueStack;
import ca.jrvs.practice.codingChallenge.StackQueue.SingleQueueStack;
import org.junit.Test;

public class StackQueueTest {

  @Test
  public void StackQueueTest() {
    DoubleQueueStack stack = new DoubleQueueStack();
    stack.push(20);
    stack.push(110);
    stack.push(30);
    assertEquals(30, stack.pop());
    assertEquals(110, stack.pop());
    stack.push(10);
    assertEquals(10, stack.pop());
    assertEquals(20, stack.pop());
  }

  @Test
  public void StackQueueOneQueue() {
    SingleQueueStack stack = new SingleQueueStack();
    stack.push(20);
    stack.push(110);
    stack.push(30);
    assertEquals(30, stack.pop());
    assertEquals(110, stack.pop());
    stack.push(10);
    assertEquals(10, stack.pop());
    assertEquals(20, stack.pop());
  }

}
