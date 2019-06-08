package com.marlabs.collections.examples;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		System.out.println("from compare Method");
		int result = o1.getProductId().compareTo(o2.getProductId());
		System.out.println(result);
		return result;
	}
}
