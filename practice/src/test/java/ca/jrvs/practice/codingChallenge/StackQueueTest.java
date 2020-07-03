package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackQueueTest {

  @Test
  public void StackQueueTest() {
    StackQueueTwoQueues stack = new StackQueueTwoQueues();
    stack.push(20);
    stack.push(110);
    stack.push(30);
    assertEquals(30, stack.pop());
    assertEquals(110, stack.pop());
    stack.push(10);
    assertEquals(10, stack.pop());
    assertEquals(20, stack.pop());
    assertEquals(-1, stack.pop());
  }

  @Test
  public void StackQueueOneQueue() {
    StackQueueOneQueue stack = new StackQueueOneQueue();
    stack.push(20);
    stack.push(110);
    stack.push(30);
    assertEquals(30, stack.pop());
    assertEquals(110, stack.pop());
    stack.push(10);
    assertEquals(10, stack.pop());
    assertEquals(20, stack.pop());
    assertEquals(-1, stack.pop());
  }

}
