package com.umesh.jan42024;

class A {

  public static void m1(){
    System.out.println(" class A");
  }

}


class B extends A {


  public static void m1(){
    System.out.println("class B");
  }
}

public class StaticOverideTest {

  public static void main(String[] args) {
    A a = new B();
    a.m1();        // class A

    B b = new B();
    b.m1();   // class B

    A.m1();
    B.m1();




  }

}

