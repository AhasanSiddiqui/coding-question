package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EX69AgeCalculationCalendar {

	public static void main(String[] args) throws ParseException {
		String mydate = "27/02/1991";

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = df.parse(mydate);
		Date date2 = new Date();

		cal1.setTime(date1);
		cal2.setTime(date2);

		int age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR);
		if (cal1.get(Calendar.DAY_OF_YEAR) > cal2.get(Calendar.DAY_OF_YEAR)) {
			age--;
		}
		System.out.println(age);
	}
}
