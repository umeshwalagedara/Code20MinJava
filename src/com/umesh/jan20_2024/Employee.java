package com.umesh.jan20_2024;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Employee {        // final so this can nt be sub classed

  private final String name;
  private final Date date;
  private final List<String> mobiles;

  private final Address address;

  public Employee(final String name, final Date date, final List<String> mobiles,
      final Address address) {
    this.name = name;
    this.date = date;
    this.mobiles = mobiles;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public Date getDate() {
    return (Date) date.clone();
  }

  public List<String> getMobiles() {
    return new ArrayList<>(mobiles);
  }

  public Address getAddress() {
    return new Address(address.getNo(), address.getStreet());
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", date=" + date +
        ", mobiles=" + mobiles +
        ", address=" + address +
        '}';
  }

  public static void main(String[] args) {

    List l = new ArrayList();
    l.add("A");
    l.add("B");


    Employee e = new Employee("Abc", new Date(), l, new Address("70", "Bulugolla"));
    System.out.println(e);

    // e.name = "test"     not allowed to set this as this is final
    e.getDate().setTime(100000000);  // as getDate is returning a clone of date, original will not be changed.
    e.getMobiles().add("C");         // get dateMobiles is returning a differnt and new List the original is not affected
    e.getAddress().setNo("71");      // as get adress is giving a new Address() original is not changed.

    System.out.println(e);


  }
}
