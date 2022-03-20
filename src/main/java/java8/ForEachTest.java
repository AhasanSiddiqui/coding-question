package com.ahasan.arraysdemo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachTest {
	public static void main(String[] args) {
		/*Stream.of("A","B","C", "D")
				.forEach(e -> System.out.println(e));
*/
		Stream.of("A","B","C", "D").parallel()
				.forEach(e -> System.out.println(e));

		Stream.of("A","B","C", "D").peek(e-> System.out.println(e)).
				filter(e-> Boolean.parseBoolean(e.toLowerCase()))
				.forEachOrdered(e -> System.out.println(e));

		List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");

		list.stream().distinct().peek(e-> System.out.println(e))
				.collect(Collectors.joining(","));

		List<String> stringList = Arrays.asList("A", "B", "C", "D");
		String[] strings = stringList.stream().toArray(String[]::new);
	}
}
