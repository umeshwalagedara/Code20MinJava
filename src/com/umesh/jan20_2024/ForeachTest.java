package com.umesh.jan20_2024;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForeachTest {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(10,20,30,40,50);

    for(int i= 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    System.out.println(" ------------------------");
    Iterator iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

    System.out.println(" ------------------------");
    for(Integer i : list){
      System.out.println(i);
    }

    System.out.println("===========================");
    list.forEach(i -> System.out.println(i));



  }

}
