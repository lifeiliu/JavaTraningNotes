package com.marlabs.junit.basicexamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamples {
	public String getWeekDayName(final String inputDate, final String dateStyle)
			throws ParseException, NullPointerException {
		final String METHOD_NAME = "getWeekDayName";
		String weekDayName = null;
		System.out.println("Method Invoked:" + METHOD_NAME + ":" + inputDate
				+ ":" + dateStyle);
		// Business Logic
		if (inputDate == null) {
			throw new NullPointerException();
		}
		SimpleDateFormat dateFormatter = new SimpleDateFormat(dateStyle);
		Date convertedDate = dateFormatter.parse(inputDate);
		dateFormatter = new SimpleDateFormat("EEEE");
		weekDayName = dateFormatter.format(convertedDate);
		System.out.println("Response From The Method:" + METHOD_NAME + ":"
				+ weekDayName);
		return weekDayName;
	}
}
