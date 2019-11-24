package com.iaditya;

public class RunnableSample {

  public static void main(String... args) {
    System.out.println("Test");
    
    //Pre Java 8
      Runnable runnable = new Runnable(){
           @Override
           public void run(){
             System.out.println("Hello world !");
           }
         };
    runnable.run();
    
    //Java 8 through 13
    Runnable runnableLambda = () -> System.out.println("Hello world lambda!");
    runnableLambda.run();

  }

  
}