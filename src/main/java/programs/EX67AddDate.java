package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EX67AddDate {

	public static void main(String[] args) throws ParseException {
		String input1 = "27/08/1991";

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date mydate = df.parse(input1);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(mydate);

		calendar.add(Calendar.DATE, 10);
		mydate = calendar.getTime();

		String output = df.format(mydate);
		System.out.println(output);
	}
}
