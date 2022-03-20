package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EX71GetDayOfWeek {

	public static void main(String[] args) throws ParseException {
		String input = "27/03/1991";

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = df.parse(input);

		df = new SimpleDateFormat("EEEE");
		String output = df.format(date);

		System.out.println(output);
	}
}
