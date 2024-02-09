package com.umesh.july16;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

  // Iterate through a map

  public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "a");
    map.put(2, "b");
    map.put(3, "c");
    map.put(4, "d");
    map.put(5, "e");

   Set<Integer> keySet =  map.keySet();
    System.out.println(keySet);

   Collection<String> values = map.values();
   System.out.println(values);

   Set<Entry<Integer, String>> entrySet = map.entrySet();
   for(Entry<Integer, String> i : entrySet){
     System.out.println(i.getKey() + " " + i.getValue());
   }




  }

}
