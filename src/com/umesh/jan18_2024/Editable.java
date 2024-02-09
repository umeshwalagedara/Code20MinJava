package com.umesh.jan18_2024;

@FunctionalInterface
public interface Editable {

  public String edit(String s);


  // it can have object class methods
  int hashCode();
  String toString();
  boolean equals(Object o);



}
