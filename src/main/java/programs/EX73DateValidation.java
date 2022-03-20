package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EX73DateValidation {
	public static void main(String args[]) throws ParseException {
		String input = "11/02/1992";
		int output;

		Calendar calendar = Calendar.getInstance();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = df.parse(input);
		calendar.setTime(date);

		output = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println(output);

	}
}
