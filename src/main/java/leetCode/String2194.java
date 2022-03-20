package com.ahasan.arraysdemo.leetCode;

import java.util.ArrayList;
import java.util.List;

public class String2194 {
	public static void main(String[] args) {
		cellsInRange("A1:F1").forEach(System.out::println);
	}

	public static List<String> cellsInRange(String s) {
		char c1 = s.charAt(0);
		char c2 = s.charAt(3);
		char r1 = s.charAt(1);
		char r2 = s.charAt(4);
		List<String> cells = new ArrayList<>();

		for (char c = c1; c <= c2; ++c) {
			for (char r = r1; r <= r2; ++r) {
				cells.add("" + c + r);
			}
		}
		return cells;
	}
}
