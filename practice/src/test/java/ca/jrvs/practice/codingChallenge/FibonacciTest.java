package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void Fibonacci() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals("the first fibonacci number is 1", 1, fibonacci.fib(1));
    assertEquals("the second fibonacci number is 1", 1, fibonacci.fib(2));
    assertEquals("the third fibonacci number is 2", 2, fibonacci.fib(3));
    assertEquals("the fourth fibonacci number is 3", 3, fibonacci.fib(4));
  }

  @Test
  public void FibonacciDynamic() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals("The first fibonacci number is 1", 1, fibonacci.fibDynamic(1));
    assertEquals("The second fibonacci number is 1", 1, fibonacci.fibDynamic(2));
    assertEquals("The third fibonacci number is 2", 2, fibonacci.fibDynamic(3));
    assertEquals("The fourth fibonacci number is 3", 3, fibonacci.fibDynamic(4));
  }
}
