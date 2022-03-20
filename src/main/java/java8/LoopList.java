package com.ahasan.arraysdemo.java8;

import java.util.*;
import java.util.stream.Stream;

public class LoopList{
	public static void main(String[] args){

		System.out.println("----------------Print List in java 8-----------------------");
		loopListJava8();
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);

		System.out.println("----------------Before java 8-----------------------");
		for (Map.Entry entry : map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		System.out.println("----------------In java 8 first way -----------------------");
		map.forEach((key,value)->System.out.println(key+" : "+value));

		System.out.println("----------------In java 8 first way using stream-----------------------");

		map.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" : "+entry.getValue()));
	}

	public static void loopListJava8(){

		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(null);
		list.add(null);

		list.add("D");
		list.add("E");

		//list.forEach(System.out::println);

		//list.stream().filter(Objects::nonNull).forEach(System.out::println);

		Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");
		s.parallel().forEach(x -> System.out.println(x));

		s.parallel().forEachOrdered(x -> System.out.println(x));

	}
}
