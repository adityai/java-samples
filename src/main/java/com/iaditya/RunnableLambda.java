package com.iaditya;

public class RunnableLambda {

  public static void main(String... args) {
    System.out.println("Test");
    Runnable runnable = () -> System.out.println("Hello world!");
    runnable.run();

  }

  
}