package com.marlabs.collections.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListAPIDemo {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		List list = new ArrayList();
		int size = list.size();
		System.out.println("Size:" + size);
		boolean isEmpty = list.isEmpty();
		System.out.println("isEmpty:?" + isEmpty);
		list.add("Srinivas");
		list.add("Vasu");
		list.add(new Date());
		list.add(10); // Auto -Boxing Feature - JDK 1.5 Version
		// list.add(new Integer(10));
		list.add("Srinivas");
		list.add(10);
		list.add(null);
		list.add(null);
		list.add(0, "Challa");
		size = list.size();
		System.out.println("Size:" + size);
		System.out.println(list); // list.toString();
		boolean containsFlag = list.contains("Vasu");
		System.out.println("contains Value:" + containsFlag);
		Object object[] = list.toArray();
		// The For Each Loop - The Enhanced For Loop
		// JDK 1.5 Version Updation
		for (Object obj : object) {
			System.out.println(obj);
		}

		System.out.println(list.remove("Srinivas"));
		System.out.println(list);
		Object object2 = list.remove(0);
		System.out.println(object2);
		System.out.println(list);

		Object object3 = list.get(1);
		System.out.println(object3);
		System.out.println(list.set(1, "Srinivas"));
		System.out.println(list);

		System.out.println(list.indexOf("Srinivas"));
		System.out.println(list.lastIndexOf("Srinivas"));

		List subList = list.subList(0, 5);
		System.out.println(subList.size());
		System.out.println(subList);
		subList.add(new Product("P101", "Soft Drink", 50.50d));
		subList.add(0, new Product("P102", "Butter Milk", 12.50d));
		System.out.println(subList.size());
		System.out.println(subList);
		System.out.println("End Of Main Method");
	}
}
