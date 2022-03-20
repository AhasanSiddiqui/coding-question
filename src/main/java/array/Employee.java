package com.ahasan.arraysdemo.array;

import java.util.ArrayList;

public final class Employee {

	private final String name;
	private final ArrayList addresses;

	public Employee(String name, ArrayList addresses) {
		super();
		this.name = name;
		ArrayList tempAdd = new ArrayList();
		for (int i = 0; i < addresses.size(); i++) {
			tempAdd.add(addresses.get(i));
		}
		this.addresses = tempAdd;
	}

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Lucknow");
		stringList.add("Gonda");
		Employee employee = new Employee("Ahasan", stringList);
        System.out.println(employee);

     employee.getAddresses().add("Delhi");
     System.out.println(employee);
	}

	public String getName() {
		return name;
	}

	public ArrayList getAddresses() {
		return (ArrayList) addresses.clone();
	}

 @Override
 public String toString() {
  return "Employee{" +
          "name='" + name + '\'' +
          ", addresses=" + addresses +
          '}';
 }
}
