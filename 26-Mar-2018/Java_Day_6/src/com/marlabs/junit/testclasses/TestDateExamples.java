package com.marlabs.junit.testclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.marlabs.junit.basicexamples.DateExamples;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDateExamples {
	private static DateExamples dateExamplesInstance;

	@BeforeClass
	public static void init() {
		dateExamplesInstance = new DateExamples();
	}

	@AfterClass
	public static void destroy() {
		dateExamplesInstance = null;
	}

	@Test
	public void testGetWeekDayName() {
		try {
			String result = dateExamplesInstance.getWeekDayName("10/05/1986",
					"dd/MM/yyyy");
			assertEquals("Saturday", result);
		} catch (ParseException e) {
			fail();
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testGetWeekDayName1() {
		try {
			String result = dateExamplesInstance.getWeekDayName("10/05/1986",
					"dd-MM-yyyy");
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	@Test(expected = NullPointerException.class)
	public void testGetWeekDayName2() {
		try {
			String result = dateExamplesInstance.getWeekDayName(null,
					"dd/MM/yyyy");
		} catch (ParseException e) {
			fail();
		}
	}
}
