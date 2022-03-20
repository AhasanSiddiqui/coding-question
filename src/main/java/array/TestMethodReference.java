package com.ahasan.arraysdemo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestMethodReference {
	public static void main(String[] args) {
		Arrays.asList("Ahasan","SIDDIQUI").stream().map(String::toLowerCase)
				.collect(Collectors.toList())
				.forEach(System.out::println);


		new Thread(()-> System.out.println("Ahasan Siddiquui")).start();
	}
}


