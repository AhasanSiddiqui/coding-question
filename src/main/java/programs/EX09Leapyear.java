package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX09Leapyear {
	public static void main(String args[]) {
		int year, output;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		year = in.nextInt();

		if (year % 400 == 0) {
			output = 1;
		} else if (year % 100 == 0) {
			output = -1;
		} else if (year % 4 == 0) {
			output = 1;
		} else {
			output = -1;
		}

		if (output == 1) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}
	}
}

// This method returns 100 as Leap year
// Calendar calendar = new GregorianCalendar();
// if (calendar.isLeapYear(year)) {
// System.out.println("Leap Year");
// } else {
// System.out.println("Not leap year");
// }