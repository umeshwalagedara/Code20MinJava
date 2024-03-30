package com.umesh.mar30_2024;

import java.util.Objects;

public class Employee {

  private int Id;

  private String name;

  private int age;

  public Employee(final int id, final String name, final int age) {
    Id = id;
    this.name = name;
    this.age = age;
  }

  public int getId() {
    return Id;
  }

  public void setId(final int id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(final int age) {
    this.age = age;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Employee employee)) {
      return false;
    }
    return age == employee.age && Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Id, name, age);
  }


}
