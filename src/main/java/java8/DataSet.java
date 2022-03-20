package com.ahasan.arraysdemo.java8;

import java.util.List;
import java.util.stream.Collectors;

public class DataSet {
	public static List<String> namesList(){
		return List.of("Bob", "Jamie", "Jill", "Rick");

	}

	public static List<String> stringToLowerCase() {
		return namesList().parallelStream().map(String::toLowerCase).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		stringToLowerCase().forEach(System.out::println);
	}
}
