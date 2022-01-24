package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		boolean result = false;
		result = new GregorianCalendar().isLeapYear(year);
		return result;
	}
	public long leapDate(Calendar c) {
		long result = 0;
		Calendar c1 = new GregorianCalendar(2019,3,15);
		long diffTime = c.getTimeInMillis() - c1.getTimeInMillis();
		result = diffTime /24/60/60/1000;
		return result;
	}
}
