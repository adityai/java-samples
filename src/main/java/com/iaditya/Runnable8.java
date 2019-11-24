package com.iaditya;

/**
* Runnable class in Java8-13
*/
public class Runnable8 {

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