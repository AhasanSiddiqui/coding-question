package com.ahasan.arraysdemo.java8;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tavant {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {4, 5, 6, 7, 8};
		Supplier<Map> obj2 = HashMap::new;
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		//alpha.stream().map(String::toUpperCase).forEach(System.out::println);

		/*IntStream stream1 = Arrays.stream(arr1);
		IntStream stream2 = Arrays.stream(arr2);
		IntStream.concat(stream1,stream2).forEach(System.out::println);*/
		//or
		//IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).forEach(System.out::println);

		System.out.println();
		//IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).collect(Collectors::s);


		System.out.println("-----------------Common Value-------------------");
		findCommonBetweenTwoArrays(arr1, arr2).forEach(System.out::println);
		findNonCommonBetweenTwoArrays(arr1, arr2);
	}

	private static void findNonCommonBetweenTwoArrays(int[] arr1, int[] arr2) {

		int count =arr1.length+arr2.length;
		for (int i = 0; i < count; i++) {

		}
		Set<Integer> arr1Set = new HashSet<>();
		for (int a1 : arr1) {
			arr1Set.add(a1);
		}
		for (int a2 : arr2) {
			arr1Set.add(a2);
		}

		//{1,2,3,4,5,6,7,8,}

		List<Integer> commonBetweenTwoArrays = findCommonBetweenTwoArrays(arr1, arr2);
		for (Integer element : commonBetweenTwoArrays) {
			if(arr1Set.contains(element))
				arr1Set.remove(element);
		}

		System.out.println("-----------------Non Common Value-------------------");
		arr1Set.forEach(System.out::println);
	}

	private static List<Integer> findCommonBetweenTwoArrays(int[] arr1, int[] arr2) {
		List<Integer> commonValues = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					commonValues.add(arr1[i]);
				}
			}
		}
		return commonValues;
	}
}
