package com.ahasan.arraysdemo.array;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@Getter
@Setter
public class Campaign {
	private boolean isActive;

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4);
		int total = 0;

		for (Integer x : numbers) {
			if (x % 2 == 0)
				total += x * x;
		}
	}

	String processFunction(Integer number, Function<Integer, String> lambda) {
		return lambda.apply(number);
	}
}
