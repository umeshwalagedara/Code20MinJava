package com.umesh.jan17_2024;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {

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
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Employee employee)) {
      return false;
    }
    return id == employee.id && Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  public static void main(String[] args) {

    Employee e = new Employee();
    e.setId(1);
    e.setName("A");

    Employee e2 = new Employee();
    e2.setId(1);
    e2.setName("A");


    Set<Employee> set = new HashSet<>();
    set.add(e);
    set.add(e2);
    //set.add(e3);

    System.out.println(set);


  }
}
