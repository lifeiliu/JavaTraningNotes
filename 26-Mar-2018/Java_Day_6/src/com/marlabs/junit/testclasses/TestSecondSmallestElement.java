package com.marlabs.junit.testclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.marlabs.junit.basicexamples.SecondSmallestElementExample;

public class TestSecondSmallestElement {
	private static SecondSmallestElementExample instance;

	@BeforeClass
	public static void init() {
		instance = new SecondSmallestElementExample();
	}

	@AfterClass
	public static void destroy() {
		instance = null;
	}

	@Test
	public void testGetSecondSmallestElement() {
		int inputArray[] = { 10, 23, 34, 45, 56, 67, 10, 23, 45, 89, 90 };
		try {
			int result = instance.getSecondSmallestElement(inputArray);
			assertEquals(23, result);
		} catch (NullPointerException e) {
			fail();
		}
	}

	@SuppressWarnings("unused")
	@Test(expected = NullPointerException.class)
	public void testGetSecondSmallestElement1() {
		int inputArray[] = null;
		int result = instance.getSecondSmallestElement(inputArray);
	}
}
