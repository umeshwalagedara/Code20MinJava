package com.umesh.may8;

import java.util.Arrays;
import java.util.List;

public class StringExsistsChk {

  public static void main(String[] args) {

    List<String> stringList = Arrays.asList("java", ".net", "python", "scala", "ruby", "php");
    String someStr = " java and python are good languages for BE development";

    System.out.println(stringList.stream().anyMatch(someStr::contains));

  }

}
