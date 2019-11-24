package com.iaditya;

import java.util.stream.Stream;

/**
* Stream methods in Java 9-13
*/
public class Streams9 {

  public static void main(String... args) {
    System.out.println("Streams in Java 9");

  //Streams got a couple of additions, in the form of takeWhile,dropWhile,iterate methods.
  Stream<String> stream = Stream.iterate("", s -> s + "s")
      .takeWhile(s -> s.length() < 10);
  stream.forEach(System.out::println);  

  //TODO: Add a sample for dropWhile - https://docs.oracle.com/javase/9/docs/api/?java/util/stream/Stream.html
    
  }
}