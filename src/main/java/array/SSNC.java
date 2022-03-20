package com.ahasan.arraysdemo.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SSNC {
	public static void main(String[] args) {
		//
		Stream.of("ant","add","cat","bol","cup","bat")
				.collect(Collectors.groupingBy(Function.identity()))
				.forEach((k,v)-> System.out.println(k+" : "+v));

		Set<String> stringSet=new HashSet<>();
		stringSet.add(new String("abc"));
		stringSet.add("abc");

		System.out.println(stringSet);

		System.out.println(getValue());
	}

	public static int getValue() {
		int i=5;
		try {
			i=i/0;
			return i;
		} catch (Exception e) {
			i=100;
			return i;
		}
		finally {
			i=200;
		}
	}
}
