package com.umesh.may7;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListStreams {
  // streams. parallel streams, max, min, filter, anyMatch,

  // IntStream and sum

  public static void main(String[] args) {

    // multiply each number on a list by two
    List<Integer> l = Arrays.asList(1,2,4,5,7,6,4,8);

    l = l.stream().map(i -> i * 3).collect(Collectors.toList());
    System.out.println(l);

    int max =  l.stream().max(Integer::compareTo).get();
    System.out.println(max);

    l = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
    System.out.println(l);

    boolean anyNUmbersDevidedBy3 =  l.stream().anyMatch(i -> i %3 == 0);
    System.out.println(anyNUmbersDevidedBy3);

    int min = l.parallelStream().min(Integer::compareTo).get();
    System.out.println(min);

    int sum = l.stream().mapToInt(new ToIntFunction<Integer>() {
      @Override
      public int applyAsInt(final Integer value) {
        return value;
      }
    }).sum();

    System.out.println(sum);




    // for latter
    IntStream intStream = IntStream.range(1, 10).map( i-> i * 2);
    int[]  intArr = intStream.toArray();





  }

}
