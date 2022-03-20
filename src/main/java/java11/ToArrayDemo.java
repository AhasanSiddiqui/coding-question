package com.ahasan.arraysdemo.java11;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo{
	public static void main(String[] args){
		List<Integer> integers=List.of(1,2,3,4,5,6,7,8,9);
		System.out.println(integers);

		Object[] array1=integers.stream().toArray();
		Object[] array2=integers.stream().toArray(size->new Integer[size]);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		Object[] array3=integers.toArray(Integer[]::new);
		Integer[] array4=integers.toArray(size->new Integer[size]);

		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));

	}
}
