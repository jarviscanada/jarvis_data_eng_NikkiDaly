package ca.jrvs.apps.practice;

import static java.lang.Math.sqrt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaStreamExcImp implements LambdaStreamExc {

  @Override
  public Stream<String> createStrStream(String... strings) {
    Stream<String> strStream = Stream.of(strings);
    return strStream;
  }

  @Override
  public Stream<String> toUpperCase(String... strings) {
    Stream<String> upperCaseStream = createStrStream(strings).map(element -> element.toUpperCase());
    return upperCaseStream;
  }

  @Override
  public Stream<String> filter(Stream<String> stringStream, String pattern) {
    Stream<String> filteredStream = stringStream.filter(str -> !str.contains(pattern));
    return filteredStream;
  }

  @Override
  public IntStream createIntStream(int[] arr) {
    IntStream strInt = Arrays.stream(arr);
    return strInt;
  }

  @Override
  public <E> List<E> toList(Stream<E> stream) {
    List list = stream.collect(Collectors.toList());
    return list;
  }

  @Override
  public List<Integer> toList(IntStream intStream) {
    List<Integer> integerList = intStream.boxed().collect(Collectors.toList());
    return integerList;
  }

  @Override
  public IntStream createIntStream(int start, int stop) {
    IntStream intStream = IntStream.range(start, stop + 1);
    return intStream;
  }

  @Override
  public DoubleStream squareRootIntStream(IntStream intStream) {
    DoubleStream doubleStream = intStream.asDoubleStream();
    doubleStream.map(num -> sqrt(num));
    return doubleStream;
  }

  @Override
  public IntStream getOdd(IntStream intStream) {
    IntStream oddIntegerStream = intStream.filter(num -> num % 2 == 1);
    return oddIntegerStream;
  }

  @Override
  public Consumer<String> getLambdaPrinter(String prefix, String suffix) {
    Consumer<String> stringConsumer = (str) -> System.out.println(prefix + str + suffix);
    return stringConsumer;
  }

  @Override
  public void printMessages(String[] messages, Consumer<String> printer) {
    for (String msg : messages) {
      printer.accept(msg);
    }
  }

  @Override
  public void printOdd(IntStream intStream, Consumer<String> printer) {
    IntStream filteredStream = intStream.filter(num -> num % 2 == 1);
    filteredStream.forEach(num -> printer.accept(String.valueOf(num)));
  }

  @Override
  public Stream<Integer> flatNestedInt(Stream<List<Integer>> ints) {
    Stream<Integer> integerStream = ints.flatMap(num -> num.stream()).map(num -> num * num);
    return integerStream;
  }
}
