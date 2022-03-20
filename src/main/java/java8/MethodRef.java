package com.ahasan.arraysdemo.java8;

import java.util.Arrays;

public class MethodRef{
	public static void main(String[] args){

		String ip ="198.11.0.100";
		String[] split=ip.split("/.");

		for (String str :split	) {
			System.out.println(str);
		}

		//System.out.println(split[3]);
		//sortStringArray();
	}

	private static void sortStringArray(){
		String[] stringArray = { "Barbara", "James", "Mary", "John",
				"Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		Arrays.stream(stringArray).sorted().forEach(System.out::println);
	}
}
