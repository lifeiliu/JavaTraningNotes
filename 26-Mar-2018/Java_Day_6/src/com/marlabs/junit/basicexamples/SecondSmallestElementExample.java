package com.marlabs.junit.basicexamples;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecondSmallestElementExample {
	public int getSecondSmallestElement(final int inputArray[])
			throws NullPointerException {
		final String METHOD_NAME = "getSecondSmallestElement";
		int outPutValue = 0;
		System.out.println("Method Invoked:" + METHOD_NAME + ":"
				+ Arrays.toString(inputArray));
		if (inputArray == null) {
			throw new NullPointerException();
		}
		// Generic's Concept- JDK 1.5 Version
		SortedSet<Integer> mySet = new TreeSet<Integer>();
		System.out.println("Size:" + mySet.size()); // Auto Growable Entity
		for (int i : inputArray) {
			mySet.add(i);
		}
		System.out.println(mySet);
		System.out.println("Size:" + mySet.size());
		Object obj[] = mySet.toArray();
		outPutValue = (Integer) obj[1];
		System.out.println("Response From The Method:" + METHOD_NAME + ":"
				+ outPutValue);
		return outPutValue;
	}

}
