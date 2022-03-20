package com.ahasan.arraysdemo.wissen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Student {
	private final String name;
	private final List<Department> departments;

	public Student(String name,List<Department> departments) {
		this.name = name;
		this.departments = new ArrayList<>(departments);
	}


	public String getName() {
		return name;
	}

	public List<Department> getDepartments() {
		return Collections.unmodifiableList(departments);
	}

	public static void main(String[] args) {

		List<Department> departments = new ArrayList<>();
		departments.add(new Department("D1"));
		Student ahasan = new Student("Ahasan",departments);

		System.out.println(ahasan.getDepartments());
		departments.add(new Department("D2"));

		System.out.println(ahasan.getDepartments());

	}
}
