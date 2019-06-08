package com.marlabs.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListAPIDemo3 {
	public static void main(String[] args) {
		// Generic's Concept- JDK 1.5 Version
		List<String> myStringList = new ArrayList<String>();
		myStringList.add("India");
		myStringList.add("US");
		myStringList.add("England");
		myStringList.add("Uganda");
		// myStringList.add(10);
		String object = null;
		myStringList.add(object);
		myStringList.add(null);
		Iterator<String> myStrings = myStringList.iterator();
		while (myStrings.hasNext()) {
			String string = myStrings.next();
			System.out.println(string);
			if (string == null) {
				myStrings.remove();
			}
		}
		System.out.println(myStringList);
		List<String> myStringList1 = new LinkedList<String>();
		myStringList1.add("India");
		myStringList1.add("US");
		myStringList1.add("Japan");
		myStringList1.add("China");
		myStringList.addAll(myStringList1); // A UNION ALL B // In Set's UNION
		System.out.println("addAll Method Result:" + myStringList);
		boolean result = myStringList.containsAll(myStringList1);
		System.out.println("containsAll Method Result:" + result);
		result = myStringList.retainAll(myStringList1); // A INTERSECT B
		System.out.println("retainAll Method Result:" + result);
		System.out.println(myStringList);
		myStringList.add("Australia");
		myStringList.removeAll(myStringList1); // A MINUS B
		System.out.println("removeAll Method Result:" + myStringList);
	}
}
