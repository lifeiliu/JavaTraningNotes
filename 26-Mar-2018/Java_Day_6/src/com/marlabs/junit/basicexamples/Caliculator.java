package com.marlabs.junit.basicexamples;

public class Caliculator {
	public int add(int a, int b) throws NegativeNumberException {
		if (a < 0 || b < 0) {
			throw new NegativeNumberException("Dont Enter Negative Values");
		}
		return a + b;
	}

	public int devide(int a, int b) throws NegativeNumberException,
			ArithmeticException {
		if (a < 0 || b < 0) {
			throw new NegativeNumberException("Dont Enter Negative Values");
		}
		if (b == 0) {
			throw new ArithmeticException("Dont Enter Zero For Denominator");
		}
		return a / b;
	}
}
