package com.iaditya;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectionOf9 {

  public static void main(String... args) {
    System.out.println("Collection.of() sample");

    //Easy way of loading data into collections
    List<String> list = List.of("one", "two", "three");
    Set<String> set = Set.of("one", "two", "three");
    Map<String, String> map = Map.of("foo", "one", "bar", "two");
  }
}