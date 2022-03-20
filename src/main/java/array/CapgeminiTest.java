package com.ahasan.arraysdemo.array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CapgeminiTest {

	public static void main(String[] args) {
		List<Student1> list=getAllStudents().get();


		list.stream().filter(s->s.equals("female")).collect(Collectors.toList());


		list.stream().map(Student1::getHobby)
				.flatMap(hobbies->hobbies.stream())
					.filter(hobby->hobby.equals("volleyball"))
						.collect(Collectors.toList());

	}

	public static Optional<List<Student1>> getAllStudents(){

	Student1 student1 = new Student1("Rohit",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
	Student1 student2 = new Student1("Sushil",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));
	Student1 student3 = new Student1("Rina",2,3.8,"female", 11,Arrays.asList("swimming", "gymnastics","soccer"));

		List<Student1> students = Arrays.asList(student1,student2,student3);
		return Optional.of(students);
	}


}
