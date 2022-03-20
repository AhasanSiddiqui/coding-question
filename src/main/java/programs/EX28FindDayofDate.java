/**
 * Given input="24/07/1990";
 * String output=tuesday;
 * output should be the day in the particular month and it should be in lowercases
 */

package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX28FindDayofDate {
	public static void main(String args[]) throws ParseException {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Date in DD/MM/YYYY : ");
		String input = in.next();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date newdate = dateFormat.parse(input);

		dateFormat = new SimpleDateFormat("EEEE");
		String output = dateFormat.format(newdate);
		output = output.toLowerCase();

		System.out.println("Day is " + output);
	}
}