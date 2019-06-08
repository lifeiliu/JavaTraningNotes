package com.marlabs.collections.map;

import java.util.Comparator;

public class IdComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {

		return o1.getCustomerId().compareTo(o2.getCustomerId());
	}

}
