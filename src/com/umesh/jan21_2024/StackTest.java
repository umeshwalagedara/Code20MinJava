package com.umesh.jan21_2024;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackTest {

  public static void main(String[] args) {

    Stack<Integer> s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(2);


    Iterator iterator = s.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }




  }

}
