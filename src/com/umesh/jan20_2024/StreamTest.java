package com.umesh.jan20_2024;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

  public static void main(String[] args) {

    List<Integer> values = new ArrayList<>();
    for(int i=0; i< 100; i++){
      values.add(i);
    }

    for(int i: values){
      System.out.println(i);
    }

    values.forEach(i -> System.out.println(i));
    values.forEach(System.out :: println);

    values.stream().forEach(System.out :: println);
    values.parallelStream().forEach(System.out :: println);





  }

}
