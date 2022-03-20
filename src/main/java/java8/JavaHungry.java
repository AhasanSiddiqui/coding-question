package com.ahasan.arraysdemo.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaHungry {
    
    public static void main(String[] args)
    {
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Java", 1);
        hashmap.put("Hungry" , 2);
        hashmap.put("Blogspot" , 3);

        Iterator iteratorobject = hashmap.keySet().iterator();
        while(iteratorobject.hasNext()){
            Object next = iteratorobject.next();
            System.out.print(hashmap.get(next));
            hashmap.remove("Hungry");
        } 
    }
}