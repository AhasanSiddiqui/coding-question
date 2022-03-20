package com.ahasan.arraysdemo.strings;

import java.util.*;
import java.util.stream.Collectors;

public class Ericson {
	public static void main(String[] args) {
		String str="My Name is Mohd Ahasan Siddiqui and I am working in Ericson";

		// Sort Based on the length of the String
		// Also the Natural Order
		sortString(str);
	}

	private static void sortString(String str) {
		Set<String> stringList = Arrays.asList(str.toLowerCase().split(" ")).
		stream().collect(Collectors.toSet());

		stringList.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()).forEach(
				System.out::println
		);

	}
}
