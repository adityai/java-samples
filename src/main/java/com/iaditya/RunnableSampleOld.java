package com.iaditya;

public class RunnableSampleOld {

  public static void main(String... args) {
    System.out.println("Test");
      Runnable runnable = new Runnable(){
           @Override
           public void run(){
             System.out.println("Hello world !");
           }
         };
    runnable.run();

  }

  
}