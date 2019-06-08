package com.marlabs.collections.examples;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetAPIDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		// Set set = new HashSet();
		Set set = new LinkedHashSet();
		// Set set = new TreeSet();
		boolean additionFlag = set.add("Srinivas");
		System.out.println(additionFlag);
		set.add(new Product("P001", "Soft Drink", 50.50d));
		additionFlag = set.add("Srinivas");
		System.out.println(additionFlag);
		additionFlag = set.add(null);
		additionFlag = set.add(null);
		System.out.println(set);
		set.add(10.2356d);
		set.add(new Date());
		int size = set.size();
		System.out.println("Size:" + size);
		System.out.println(set);

		// Set<String> myStringSet = new HashSet<String>();
		// Set<String> myStringSet = new LinkedHashSet<String>();
		Set<String> myStringSet = new TreeSet<String>();
		myStringSet.add("India");
		myStringSet.add("US");
		myStringSet.add("China");
		myStringSet.add("Sri Lanka");
		myStringSet.add("India");
		// myStringSet.add(null);
		System.out.println(myStringSet);
		System.out.println("End Of Main Method");

		Product product = new Product("P001", "Soft Drink", 55.25d);
		Product product1 = new Product("P002", "Butter Milk", 12.25d);
		Product product2 = new Product("P003", "Soft Drink Pet Bottle", 35.25d);
		Product product3 = new Product("P001", "Soft Drink", 55.25d);
		Product product4 = product;
		// Set<Product> myProductSet = new HashSet<Product>();
		// Set<Product> myProductSet = new LinkedHashSet<Product>();
		Set<Product> myProductSet = new TreeSet<Product>();
		myProductSet.add(product);
		myProductSet.add(product1);
		myProductSet.add(product2);
		myProductSet.add(product3);
		myProductSet.add(product4);
		size = myProductSet.size();
		System.out.println("Size:" + size);
		for (Product product5 : myProductSet) {
			System.out.println(product5);
		}
		System.out.println("By Using Comparator Interface");
		SortedSet<Product> myProducts = new TreeSet<Product>(new IdComparator());
		myProducts.addAll(myProductSet);
		for (Product product5 : myProducts) {
			System.out.println(product5);
		}
	}
}
