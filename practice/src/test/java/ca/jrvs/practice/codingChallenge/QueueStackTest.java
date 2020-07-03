package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import ca.jrvs.practice.codingChallenge.QueueStack.QueueStackAmortized;
import ca.jrvs.practice.codingChallenge.QueueStack.TwoStacksQueue;
import org.junit.Test;

public class QueueStackTest {

  @Test
  public void queueStack() {
    TwoStacksQueue queue = new TwoStacksQueue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertEquals(1, queue.dequeue());
    assertEquals(2, queue.dequeue());
    queue.enqueue(4);
    assertEquals(3, queue.dequeue());
    assertEquals(4, queue.dequeue());
  }

  @Test
  public void queueStackFaster() {
    QueueStackAmortized queue = new QueueStackAmortized();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertEquals(1, queue.dequeue());
    assertEquals(2, queue.dequeue());
    queue.enqueue(4);
    assertEquals(3, queue.dequeue());
    assertEquals(4, queue.dequeue());
  }

}
