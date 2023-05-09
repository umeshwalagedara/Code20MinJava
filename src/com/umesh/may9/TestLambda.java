package com.umesh.may9;

public class TestLambda {

  public static void main(String[] args) {

    // old way
    Playable playable = new Playable() {
      @Override
      public void play() {
        System.out.println(" playing cricket");
      }
    };
    playable.play();


    // using lambda
    Playable t20 = () -> System.out.println(" play t20");
    t20.play();

    Drinkable drinkable = (drink) ->System.out.println("drinking " + drink);
    drinkable.drink("coke");

    
    Drinkable drinkable1 = (name) -> {
      System.out.println(" this is multiline impl");
      System.out.println(" drinking " + name);
    };
    drinkable1.drink("fanta");


  }

}
