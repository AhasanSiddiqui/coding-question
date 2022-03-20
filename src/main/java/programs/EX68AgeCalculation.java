package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EX68AgeCalculation {
	public static void main(String[] args) throws ParseException {
		String input1 = "27/08/1991";

		DateFormat df;
		df = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = df.parse(input1);
		Date date2 = new Date();

		df = new SimpleDateFormat("yyyy");
		int y1 = Integer.parseInt(df.format(date1));
		int y2 = Integer.parseInt(df.format(date2));
		int age = y2 - y1;

		df = new SimpleDateFormat("D");
		int d1 = Integer.parseInt(df.format(date1));
		int d2 = Integer.parseInt(df.format(date2));
		if (d1 > d2) {
			age--;
		}
		System.out.println(age);
	}
}
