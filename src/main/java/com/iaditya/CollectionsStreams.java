package com.iaditya;

import java.util.Arrays;
import java.util.List;

public class CollectionsStreams {

  public static void main(String... args) {
    System.out.println("Collections and Streams");
    List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
    
    //Pre Java 8
    for (String name : list) {
      System.out.println(name.toUpperCase());
    }
    
    //Java 8 through 13
    list.stream()
        .filter(name -> name.startsWith("f"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);
    
  }

  
}