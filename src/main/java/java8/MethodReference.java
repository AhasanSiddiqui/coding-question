package com.ahasan.arraysdemo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReference{
	public static void main(String[] args){
		List<String> list = Arrays.asList("1", "2", "3");

		list.stream().map(new Function<String,Integer>(){
			@Override
			public Integer apply(String s){
				return  Integer.parseInt(s);
			}
		}).collect(Collectors.toList()).forEach(System.out::println);
		list.stream().map(s->Integer.parseInt(s))
				.collect(Collectors.toList()).forEach(System.out::println);
		list.stream().map(Integer::parseInt)
				.collect(Collectors.toList()).forEach(System.out::println);
	}


}
