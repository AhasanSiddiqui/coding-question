package com.ahasan.arraysdemo.numbersystem;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromList{
	public static void main(String[] args){
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		for (Integer num: numbers) {
			if(numbers.contains(num))
				numbers.remove(num);
		}
		System.out.println(numbers);
	}

	private static void removeDuplicate(List<Integer> numbers){

	}
}
