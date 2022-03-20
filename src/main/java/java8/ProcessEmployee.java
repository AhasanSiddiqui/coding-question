package com.ahasan.arraysdemo.java8;

import java.util.Arrays;
import java.util.List;

public class ProcessEmployee {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(100, "Ahasan", "Gonda"),
				new Employee(101, "Rehana", "Lucknow"),
				new Employee(102, "Siddiqui", "Mumbai"),
				new Employee(103, "Bano", "Delhi"));
		printEmployee(employees);
	}

	private static void printEmployee(List<Employee> employees) {
		employees.forEach(employee -> {
			if(employee.getId()>101)
				System.out.println(employee.getId() +" : "+ employee.getName()+" : "+employee.getCity());
		});
	}
}
