package com.umesh.mar30_2024;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodeTest {

  public static void main(String[] args) {

    Employee e1 = new Employee(1, "A", 10);

    Employee e2 = new Employee(1, "A", 10);

    System.out.println(e1.equals(e2));

    System.out.println(e1.hashCode());
    System.out.println(e2.hashCode());

    Set s = new HashSet();
    s.add(e1);
    s.add(e2);
    // when adding to a set
    // it adds only non duplicates
    // so if both hashcode and equals are equal.. this will
    // be considered as equal.

    System.out.println(s);



  }

}
