package com.ahasan.arraysdemo.array;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public final class Wissen {

	private final String name;
	private final List<String> degree;

	public Wissen(String name, List<String> degree) {
		this.name = name;
		this.degree = degree;
	}

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Ahasan");

		Wissen wissen=new Wissen("Ahasan", stringList);

		stringList.add("ABC");
		System.out.println(wissen.getName());
		wissen.getDegree().forEach(System.out::println);
	}
}
