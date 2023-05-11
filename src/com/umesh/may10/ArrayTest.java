package com.umesh.may10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayTest {

  public static void main(String[] args) {

    int[] intArr = new int[5];
    int[] intArr2 = new int[]{1, 2, 3};
    int[] ints = {4, 5, 6, 7, 2, 1, 3};

    for (int i = 0; i < ints.length; i++) {
      System.out.println(ints[i]);
    }

    for (int i : ints) {
      System.out.println(i);
    }

    Arrays.stream(ints).forEach(a -> {
      System.out.println(a);
    });

    System.out.println(" -------------------------------- ");

    Arrays.sort(ints);
    System.out.println(Arrays.toString(ints));




  }
}
