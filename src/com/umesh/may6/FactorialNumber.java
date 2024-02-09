package com.umesh.may6;

import java.math.BigInteger;

public class FactorialNumber {

  public static void main(String[] args) {
    System.out.println(findFactorialOfNumber(100));
  }


  public static BigInteger findFactorialOfNumber(long number){
    if(number == 0 || number == 1){
      return BigInteger.ONE;
    }else{
      return BigInteger.valueOf(number).multiply(findFactorialOfNumber(number -1));
    }

  }

}
