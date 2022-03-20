/**
 * Experience and year of passing are given in string format. 
 * first calculate the difference of current year and year of pass. 
 * if it is greater than or equal to experience return true.
 * String i/p=2012;
 * String I/P2=5
 * IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE
 */

package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX56DateDiffereceAndCompare {
	public static void main(String args[]) throws ParseException {
		Scanner in = new Scanner(System.in);
		boolean output = false;
		System.out.println("Enter the Experience : ");
		String exp = in.next();
		int experience = Integer.parseInt(exp);

		System.out.println("Enter the Year of Passing : ");
		String yop = in.next();

		DateFormat df = new SimpleDateFormat("yyyy");
		Date today = new Date();
		String thisyear = df.format(today);

		int diff = Integer.parseInt(thisyear) - Integer.parseInt(yop);

		if (diff >= experience) {
			output = true;
		}
		System.out.println(output);
	}
}
