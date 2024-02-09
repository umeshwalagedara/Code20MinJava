package com.umesh.jan18_2024;

public class TestLambda {

  public static void main(String[] args) {

    Editable editable = new Editable() {
      @Override
      public String edit(final String s) {
        return s + " edited";
      }
    };

    System.out.println(editable.edit("umesh"));

    Editable editable1 = s ->  s + " edited lambda" ;
    System.out.println(editable1.edit("hi "));
  }

}
