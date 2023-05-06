package com.umesh.may6;

public class FactorialNumber {



  public static void main(String[] args) {

    System.out.println(findFactorialOfNumber(3));
  }


  public static int findFactorialOfNumber(int number){
    if(number == 0){
      return 1;
    }else{
      return number * findFactorialOfNumber(number -1);
    }

  }

}
