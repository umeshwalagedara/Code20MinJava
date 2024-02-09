package com.umesh.jan21_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class Student implements Comparable<Student>{

  private int id;
  private String name;

  public Student(final int id, final String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public int compareTo(final Student o) {
    return this.id - o.id;
  }
}

public class SortTest1 {

  public static void main(String[] args) {

    Set<Integer> s = new TreeSet<>();
    s.add(1);
    s.add(10);
    s.add(5);
    s.add(2);
    System.out.println(s);

    Set<String> ss = new TreeSet<>();
    ss.add("a");
    ss.add("z");
    ss.add("b");
    ss.add("x");
    System.out.println(ss);

    List l = new ArrayList();
    l.add("Abc");
    l.add("Xyz");
    l.add("Pqr");

    Collections.sort(l, Collections.reverseOrder());
    System.out.println(l);

    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student(1, "A"));
    studentList.add(new Student(3, "C"));
    studentList.add(new Student(2 ,"B"));
    Collections.sort(studentList, Collections.reverseOrder());
    System.out.println(studentList);


    }

  }

