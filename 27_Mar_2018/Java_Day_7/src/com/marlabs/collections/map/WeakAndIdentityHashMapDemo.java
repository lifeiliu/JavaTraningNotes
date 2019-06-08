package com.marlabs.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class WeakAndIdentityHashMapDemo {
	public static void main(String[] args) {
		Map<Customer, String> customerMap = new HashMap<Customer, String>();
		// Map<Customer, String> customerMap = new IdentityHashMap<Customer,
		// String>();
		Customer customer = new Customer("CI001", "Abc Traders", 570023);
		Customer customer1 = new Customer("CI003", "ZZZ Traders", 500048);
		Customer customer2 = new Customer("CI002", "XYZ Traders", 570000);
		Customer customer3 = new Customer("CI001", "Abc Traders", 570023);
		Customer customer4 = customer1;

		customerMap.put(customer, "Abc Traders");
		customerMap.put(customer1, "ZZZ Traders");
		customerMap.put(customer2, "XYZ Traders");
		customerMap.put(customer3, "Abc Traders");
		customerMap.put(customer4, "ZZZ Traders");
		int size = customerMap.size();
		System.out.println("Size:" + size);
		for (Entry<Customer, String> entry1 : customerMap.entrySet()) {
			System.out.println(entry1);
		}
		System.out.println("After Calling GC And Making One key As Null");
		customer2 = null;
		System.gc();
		size = customerMap.size();
		System.out.println("Size:" + size);
		for (Entry<Customer, String> entry1 : customerMap.entrySet()) {
			System.out.println(entry1);
		}

		System.out.println("Weak Hash Map Stuff");
		Map<Customer, String> weakCustomerMap = new WeakHashMap<Customer, String>();
		customer2 = new Customer("CI002", "XYZ Traders", 570000);
		weakCustomerMap.put(customer, "Abc Traders");
		weakCustomerMap.put(customer1, "ZZZ Traders");
		weakCustomerMap.put(customer2, "XYZ Traders");
		weakCustomerMap.put(customer3, "Abc Traders");
		weakCustomerMap.put(customer4, "ZZZ Traders");
		size = customerMap.size();
		System.out.println("Size:" + size);
		for (Entry<Customer, String> entry1 : weakCustomerMap.entrySet()) {
			System.out.println(entry1);
		}
		System.out.println("After Calling GC And Making One key As Null");
		customer2 = null;
		System.gc(); // Just We can send a Request To Garbage Collector
		size = customerMap.size();
		System.out.println("Size:" + size);
		for (Entry<Customer, String> entry1 : weakCustomerMap.entrySet()) {
			System.out.println(entry1);
		}
	}
}
