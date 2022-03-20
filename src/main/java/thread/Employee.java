package com.ahasan.arraysdemo.thread;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Employee{

	private String name;
	int salary;

	public static void main(String[] args){
		List<Employee> employees=new ArrayList<>();
		employees.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());

		employees.stream().sorted(Comparator.comparing(e->e.getName()))
				.collect(Collectors.toList());

		List<Integer> integers=Arrays.asList(1,2);
		List<Integer> ints=integers;
		ints.add(1);


	}
}
