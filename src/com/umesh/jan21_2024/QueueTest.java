package com.umesh.jan21_2024;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

class Employee {

  public Employee(final int id, final String name) {
    this.id = id;
    this.name = name;
  }

  private int id;
  private String name;

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
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

public class QueueTest {

  public static void main(String[] args) {

    PriorityQueue<Employee> queue = new PriorityQueue<>(Comparator.comparing(Employee::getId).thenComparing(Employee::getName));
    queue.add(new Employee(1, "A"));
    queue.add(new Employee(2, "B"));
    queue.add(new Employee(3, "C"));
    queue.add(new Employee(5, "S"));
    queue.add(new Employee(5, "E"));

   while (!queue.isEmpty()){
     Employee e= queue.poll();
     System.out.println(e);
   }

    Deque deque = new ArrayDeque();
   deque.add("ab");
   deque.addFirst("cd");
   deque.addFirst("ef");
   deque.add("x");
   deque.add("y");
   deque.addLast("z");

    System.out.println(deque);



  }

}
