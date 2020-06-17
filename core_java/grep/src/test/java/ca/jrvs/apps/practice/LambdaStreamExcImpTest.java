package ca.jrvs.apps.practice;

import static org.junit.Assert.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LambdaStreamExcImpTest {

  private LambdaStreamExcImp lambdaStreamExcImp;

  @Before
  public void setUp() throws Exception {
    lambdaStreamExcImp = new LambdaStreamExcImp();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void createStrStream() {
    System.out.println("Test case: test createStrStream method");
    Stream<String> stringStream = lambdaStreamExcImp.createStrStream("a", "b", "c");
    assertEquals("The expected output is abc", "abc", stringStream.collect(Collectors.joining("")));
  }

  @Test
  public void toUpperCase() {
    System.out.println("Test case: test toUpperCase method");
    Stream<String> stringStream = lambdaStreamExcImp.toUpperCase("a", "b", "c");
    assertEquals("The expected output is ABC", "ABC", stringStream.collect(Collectors.joining("")));
  }

  @Test
  public void filter() {
    System.out.println("Test case: test filter method");
    Stream<String> testStream = lambdaStreamExcImp.createStrStream("a", "ab", "c", "ca");
    String pattern = "a";
    
  }

  @Test
  public void createIntStream() {
    System.out.println("Test case: test createIntStream method");
  }

  @Test
  public void toList() {
    System.out.println("Test case: test toList method");
  }

  @Test
  public void squareRootIntStream() {
    System.out.println("Test case: test sqaureRootIntStream method");
  }

  @Test
  public void getOdd() {
    System.out.println("Test case: test getOdd method");
  }

  @Test
  public void getLambdaPrinter() {
    System.out.println("Test case: test getLambdaPrinter method");
  }

  @Test
  public void printMessages() {
    System.out.println("Test case: test printMEssages method");
  }

  @Test
  public void printOdd() {
    System.out.println("Test case: test printOdd method");
  }

  @Test
  public void flatNestedInt() {
    System.out.println("Test case: test flatNestedInt method");
  }
}