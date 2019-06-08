package com.marlabs.junit.testclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.marlabs.junit.basicexamples.Caliculator;
import com.marlabs.junit.basicexamples.NegativeNumberException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CaliculatorTest {
	private static Caliculator caliculator = null;

	@BeforeClass
	public static void init() {
		System.out.println("I Am From init Method");
		caliculator = new Caliculator();
	}

	@AfterClass
	public static void destroy() {
		System.out.println("I Am From destroy Method");
		caliculator = null;
	}

	@Test
	public void testAdd() {
		try {
			int result = caliculator.add(10, 20);
			// 30
			assertEquals(30, result);
		} catch (NegativeNumberException e) {
			fail();
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testAdd1() {
		try {
			int result = caliculator.add(-10, 20);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testAdd2() {
		try {
			int result = caliculator.add(-10, -20);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	public void testDevide() {
		try {
			int result = caliculator.devide(10, 20);
			assertEquals(0, result);
		} catch (ArithmeticException e) {
			fail();
		} catch (NegativeNumberException e) {
			fail();
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testDevide1() {
		try {
			int result = caliculator.devide(10, 0);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (NegativeNumberException e) {
			fail();
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testDevide2() {
		try {
			int result = caliculator.devide(10, -10);
		} catch (ArithmeticException e) {
			fail();
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}

	@Ignore
	@SuppressWarnings("unused")
	@Test(expected = NegativeNumberException.class)
	public void testDevide3() {
		int result = caliculator.devide(10, -10);
	}

	@Ignore
	@SuppressWarnings("unused")
	@Test(expected = ArithmeticException.class)
	public void testDevide4() {
		int result = caliculator.devide(10, 0);
	}

	@Test(timeout = 5)
	public void testDevide5() {
		try {
			int result = caliculator.devide(10, 20);
			assertEquals(0, result);
		} catch (ArithmeticException e) {
			fail();
		} catch (NegativeNumberException e) {
			fail();
		}
	}
}
