package com.marlabs.collections.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsAndArraysClassExamples {
	public static void main(String[] args) {
		List<Integer> myIntList = new ArrayList<Integer>();
		myIntList.add(10);
		myIntList.add(201);
		myIntList.add(101);
		myIntList.add(10);
		myIntList.add(103);
		myIntList.add(105);
		System.out.println(myIntList);
		Collections.sort(myIntList);
		System.out.println(myIntList);
		Collections.sort(myIntList, Collections.reverseOrder());
		System.out.println(myIntList);
		Collections.shuffle(myIntList);
		System.out.println(myIntList);
		Collections.synchronizedList(myIntList);
		System.out.println(myIntList);

		List<Integer> readOnlyList = Collections.unmodifiableList(myIntList);
		try {
			System.out.println(readOnlyList.get(0));
			readOnlyList.add(1201);
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
		}

		System.out.println(Collections.max(myIntList));
		System.out.println(Collections.min(myIntList));
		List<Product> myProductList = new ArrayList<Product>();
		Product product = new Product("101", "Butter Milk", 12);
		Product product1 = new Product("102", "Std Milk 500 ML", 32);
		Product product2 = new Product("103", "Std Milk", 60);
		Product product3 = new Product("101", "Butter Milk", 12);
		Product product4 = new Product("104", "Butter 1KG", 350);
		Product product5 = new Product("105", "Ghee 250 ML", 120);
		Product product6 = product2;
		myProductList.add(product);
		myProductList.add(product1);
		myProductList.add(product2);
		myProductList.add(product3);
		myProductList.add(product4);
		myProductList.add(product5);
		myProductList.add(product6);
		Collections.sort(myProductList, new IdComparator());
		System.out.println(myProductList);

		int inputArray[] = { 10, 23, 34, 45, 56, 67, 10, 34 };
		Arrays.sort(inputArray);
		System.out.println(Arrays.toString(inputArray));
	}
}
