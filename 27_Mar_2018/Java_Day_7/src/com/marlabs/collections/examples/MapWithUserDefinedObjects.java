package com.marlabs.collections.examples;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapWithUserDefinedObjects {
	public static void main(String[] args) {
		System.out.println("I AM From Main Method");
		Product product = new Product("P001", "Soft Drink", 55.25d);
		Product product1 = new Product("P002", "Butter Milk", 12.25d);
		Product product2 = new Product("P003", "Soft Drink Pet Bottle", 35.25d);
		Product product3 = new Product("P001", "Soft Drink", 55.25d);
		Product product4 = product;

		// Map<Product, String> inputMap = new HashMap<Product, String>();
		// Map<Product, String> inputMap = new LinkedHashMap<Product, String>();
		// Map<Product, String> inputMap = new TreeMap<Product, String>();
		Map<Product, String> inputMap = new TreeMap<Product, String>(
				new IdComparator());
		inputMap.put(product, "US");
		inputMap.put(product1, "India");
		inputMap.put(product2, "UK");
		inputMap.put(product3, "China");
		inputMap.put(product4, "US");
		int size = inputMap.size();
		System.out.println("Size:" + size);
		Set<Entry<Product, String>> entrySet = inputMap.entrySet();
		for (Entry<Product, String> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println("End Of Main Method");

	}
}
