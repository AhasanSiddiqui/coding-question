/**
 * Input1="05-02-1988" (string)
 * input2="23-04-2013" (string)
 * output=02/05/1988
 * Find which date is the oldest.
 * Input should be DD-MM-yyyy format and
 * the output should be in MM/DD/yyyy format.
 */

package com.ahasan.arraysdemo.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX61CompareDate {
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input1 and Input2 (DD-MM-YYYY) ");
		String input1 = in.next();
		String input2 = in.next();

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date dinput1 = df.parse(input1);
		Date dinput2 = df.parse(input2);
		int result = dinput1.compareTo(dinput2);
		DateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
		Date doutput;
		// Date 1 is Elder -1
		if (result < 0) {
			doutput = dinput2;
		}
		// Date 2 is Elder 1
		else if (result > 0) {
			doutput = dinput1;
		}

		// Equal 0
		else {
			doutput = dinput1;
		}

		String doutputs = df1.format(doutput);

		System.out.println("Output is " + doutputs);

	}
}
