package com.umesh.jan21_2024;


import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable {

  private int id;
  private String name;



  public Person(final int id, final String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public int compareTo(final Object o) {
    Person p = (Person) o;
    return this.id - p.id ;
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
}
public class TreeSetTest {

  public static void main(String[] args) {

    TreeSet<Person> treeSet = new TreeSet<>();
    treeSet.add(new Person(1, "Z"));
    treeSet.add(new Person(2, "Y"));
    treeSet.add(new Person(3, "X"));

    System.out.println(treeSet);


  }

}
