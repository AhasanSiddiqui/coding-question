package com.ahasan.arraysdemo.leetCode;

import java.util.GregorianCalendar;

public class String1154{
	public static void main(String[] args){
		System.out.println(new String1154().dayOfYear("1900-05-02"));
	}

	public int dayOfYear(String date) {
		String []str=date.split("-");
		int year =Integer.parseInt(str[0]);

		if(str[1].equals("01") ) {
			return Integer.parseInt(str[2]);
		}

		if(str[1].equals("02")) {
			return Integer.parseInt(str[2])+31;
		}
		
		if(str[1].equals("03")  && isLeapYear(year)) {
			return Integer.parseInt(str[2])+59+1;
		}
		
		if(str[1].equals("03")) {
			return Integer.parseInt(str[2])+59;
		}

		if(str[1].equals("04")  && isLeapYear(year)) {
			return Integer.parseInt(str[2])+90+1;
		}

		if(str[1].equals("04")) {
			return Integer.parseInt(str[2])+90;
		}

		if(str[1].equals("05")  && isLeapYear(year)) {
			return Integer.parseInt(str[2])+120+1;
		}

		if(str[1].equals("05")) {
			return Integer.parseInt(str[2])+120;
		}

		if(str[1].equals("06") && isLeapYear(year)) {
			return Integer.parseInt(str[2])+151+1;
		}

		if(str[1].equals("06") ) {
			return Integer.parseInt(str[2])+151;
		}

		if(str[1].equals("07")  && isLeapYear(year)) {
			return Integer.parseInt(str[2])+181+1;
		}

		if(str[1].equals("07") ) {
			return Integer.parseInt(str[2])+181;
		}

		if(str[1].equals("08") && isLeapYear(year)) {
			return Integer.parseInt(str[2])+212+1;
		}

		if(str[1].equals("08") ) {
			return Integer.parseInt(str[2])+212;
		}

		if(str[1].equals("09") && isLeapYear(year)) {
			return Integer.parseInt(str[2])+243+1;
		}

		if(str[1].equals("09") ) {
			return Integer.parseInt(str[2])+243;
		}

		if(str[1].equals("10") && isLeapYear(year)) {
			return Integer.parseInt(str[2])+273+1;
		}

		if(str[1].equals("10") ) {
			return Integer.parseInt(str[2])+273;
		}

		if(str[1].equals("11") && isLeapYear(year)) {
			return Integer.parseInt(str[2])+304+1;
		}

		if(str[1].equals("11") ) {
			return Integer.parseInt(str[2])+304;
		}

		if(str[1].equals("12") && isLeapYear(year)) {
			return Integer.parseInt(str[2])+334+1;
		}

		if(str[1].equals("12") ) {
			return Integer.parseInt(str[2])+334;
		}
		return 0;
	}

	public boolean isLeapYear(int year) {
		if ((year % 400 == 0)
				|| ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		}
		return false;
	}
}
