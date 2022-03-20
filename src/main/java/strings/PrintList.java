package com.ahasan.arraysdemo.strings;

import java.util.ArrayList;
import java.util.List;

public class PrintList {
	public static void main(String[] args) {
		fizzBuzz(5);
	}
	public static List<String> fizzBuzz(int n) {
		List<String> result =new ArrayList<>();
		for (int i=1;i<=n;i++){
			if(i%3==0 && i*5%n!=0)
				result.add("Fizz");
			if(i%3==0 && i%5==0)
				result.add("FizzBuzz");
			if(i%5==0 && i*3%n!=0 )
				result.add("Buzz");
			if(i%3!=0 && i%5!=0)
				result.add(""+i);
		}
		return result;
	}
}
