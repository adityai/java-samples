package com.iaditya;

import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

/**
* String and Files related samples in Java 11-13
*/
public class StringAndFiles11 {
  public static void main(String... args) throws Exception {
    System.out.println("Marco".isBlank());
    
    Stream<String> stream = "Line1\nLine2".lines();
    stream.forEach(System.out::println);  
    
    System.out.println("Marco  ".strip());

    Path path = Files.writeString(Files.createTempFile("helloworld", ".txt"), "Hi, my name is!");
    String s = Files.readString(path);
    System.out.println(s); 
  }
}