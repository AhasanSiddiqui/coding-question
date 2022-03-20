package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EX72MinutesDifference {
	public static void main(String args[]) throws ParseException {
		String time1 = "04:55:23";
		String time2 = "12:54:10";

		DateFormat df = new SimpleDateFormat("hh:mm:ss");
		Date date1 = df.parse(time1);
		Date date2 = df.parse(time2);

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(date1);
		cal2.setTime(date2);

		cal1.add(Calendar.HOUR, cal2.get(Calendar.HOUR));
		cal1.add(Calendar.MINUTE, cal2.get(Calendar.MINUTE));
		cal1.add(Calendar.SECOND, cal2.get(Calendar.SECOND));

		Date mydate = cal1.getTime();

		df = new SimpleDateFormat("dd:hh:mm:ss");
		String output = df.format(mydate);
		System.out.println("Output is " + output);
	}
}
