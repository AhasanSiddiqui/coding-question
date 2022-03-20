package com.ahasan.arraysdemo.java8;

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap{

	public static void main(String[] args){
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "mkyong.com", 1));

		Map<Integer,String> map=new HashMap<>();

		list.stream().collect(Collectors.toMap(Hosting::getId,Hosting::getName))
				.forEach((a,b)->System.out.println(a+" : "+b));

		Map<String, Long> result1 = list.stream().collect(
				Collectors.toMap(Hosting::getName, Hosting::getWebsites));

		System.out.println("Result 1 : " + result1);
		Map result2 = list.stream()
				.sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
				.collect(
						Collectors.toMap(
								Hosting::getName, Hosting::getWebsites, // key = name, value = websites
								(oldValue, newValue) -> oldValue,       // if same key, take the old key
								LinkedHashMap::new                      // returns a LinkedHashMap, keep order
						));

		System.out.println("Result 2 : " + result2);
	}
}
