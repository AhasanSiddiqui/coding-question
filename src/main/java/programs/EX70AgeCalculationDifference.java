package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EX70AgeCalculationDifference {
	public static void main(String[] args) throws ParseException {
		String input1 = "27/03/1991";

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = df.parse(input1);
		Date date2 = new Date();

		long timediff = date2.getTime() - date1.getTime();

		long days = timediff / (24 * 60 * 60 * 1000);
		System.out.println(days);

		int age = (int) (days / 365);

		System.out.println("Age is " + age);

	}
}
