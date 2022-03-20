package com.ahasan.arraysdemo.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {
	public static void main(String[] args) {
		List<Student1> students=getStudent();
		Map<Integer, List<Student1>> listMap = students.stream().collect(Collectors.groupingBy(Student1::getNid));

		List<List<Student1>> studentList = listMap.entrySet().stream().map(Map.Entry::getValue).
				collect(Collectors.toList());

		for (int i = 0; i < studentList.size(); i++) {
			List<Student1> students1 = studentList.get(i);
			int j=0;
			String newName= "";
			String newDepartment= "";
			for (Student1 student: students1) {
				if(student.getNid()==students1.get(j).getNid() && j< students1.size()){
					newName+=student.getName();
					newDepartment+=student.getDepartment();
				}
				j++;
			}
		}

		studentList.forEach(System.out::println);
		//printStudentResult(listMap);
	}

	private static void printStudentResult(Map<Integer, List<Student1>> listMap) {
		listMap.forEach((k,v)-> System.out.println(v));
	}

	public static List<Student1> getStudent() {
		return Arrays.asList(
				new Student1(123,"AA1","Johan","FOM","T1"),
				new Student1(123,"AA2","Tom","FWB","T2"),
				new Student1(124,"AA1","Nikki","ABC","T3"),
				new Student1(124,"AA1","Tom","FWB","T2"),
				new Student1(124,"AA2","Nikki","ABC","T3"),
				new Student1(125,"AA1","Johan","FOM","T1"),
				new Student1(125,"AA1","Tom","FWC","T2"),
				new Student1(125,"AA1","Nikki","FOM","T3"));
	}
}
