package com.ahasan.arraysdemo.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WissenTest2 {

	public static void main(String[] args) {
		String str ="my name is mohd ahsaan siddiqui and i am working in wissen technology";

		findLongestEvenLengthWord(str);
	}

	private static void findLongestEvenLengthWord(String str) {

		String[] strings = str.split(" ");
		String collect = Arrays.asList(strings).stream().filter(a -> a.length() % 2 == 0)
				.max(Comparator.comparing(String::length)).get();

		System.out.println(collect);



	}
}
