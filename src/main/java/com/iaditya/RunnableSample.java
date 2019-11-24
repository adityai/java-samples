package com.iaditya;

public class RunnableSample {

  public static void main(String... args) {
    System.out.println("Test");
      Runnable runnable = new Runnable(){
           @Override
           public void run(){
             System.out.println("Hello world !");
           }
         };
    runnable.run();
    
    Runnable runnableLambda = () -> System.out.println("Hello world lambda!");
    runnableLambda.run();

  }

  
}