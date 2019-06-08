package com.marlabs.collections.examples;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListAPIDemo2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		// List list = new ArrayList();
		// List list = new Vector();
		List list = new LinkedList();
		list.add("Srinivas");
		list.add("Vasu");
		list.add(new Date());
		list.add(10); // Auto Boxing - JDK 1.5 Version
		list.add(new Product("P101", "Soft Drink", 50.50d));
		list.add(0, new Product("P102", "Butter Milk", 12.50d));

		System.out.println("************************************");
		System.out.println("Iterating By Using Iterator Interface");
		System.out.println("************************************");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) { // boolean
			Object object = iterator.next(); // Object
			if (object instanceof Product) {
				Product product = (Product) object;
				System.out.println("Product Id:" + product.getProductId());
				System.out.println("Product Name:" + product.getProductName());
				System.out.println("Product Cost:" + product.getProductCost());
			} else if (object instanceof String) {
				System.out.println("String Object Is:" + object.toString());
			} else if (object instanceof Date) {
				Date date = (Date) object;
				System.out.println("Date Object Is:" + date);
			} else if (object instanceof Integer) {
				// Converting Into primitive Value
				// int intValue = ((Integer) object).intValue();
				// Auto Un-Boxing Feature JDK 1.5 Version
				int intValue = (Integer) object;
				System.out.println(intValue);
				iterator.remove();
			} else {
				System.out.println(object);
			}
		}
		System.out.println("************************************");
		System.out.println(list);
		System.out.println("************************************");
		System.out
				.println("Iterating By Using ListIterator Interface - Forward");
		System.out.println("************************************");
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) { // boolean
			Object object = listIterator.next(); // Object
			if (object instanceof Product) {
				Product product = (Product) object;
				System.out.println("Product Id:" + product.getProductId());
				System.out.println("Product Name:" + product.getProductName());
				System.out.println("Product Cost:" + product.getProductCost());
			} else if (object instanceof String) {
				System.out.println("String Object Is:" + object.toString());
			} else if (object instanceof Date) {
				Date date = (Date) object;
				System.out.println("Date Object Is:" + date);
			} else if (object instanceof Integer) {
				// Converting Into primitive Value
				// int intValue = ((Integer) object).intValue();
				// Auto Un-Boxing Feature JDK 1.5 Version
				int intValue = (Integer) object;
				System.out.println(intValue);
				listIterator.remove();
			} else {
				System.out.println(object);
			}
		}
		System.out
				.println("Iterating By Using ListIterator Interface - BackWard");
		System.out.println("************************************");
		while (listIterator.hasPrevious()) { // boolean
			Object object = listIterator.previous(); // Object
			if (object instanceof Product) {
				Product product = (Product) object;
				System.out.println("Product Id:" + product.getProductId());
				System.out.println("Product Name:" + product.getProductName());
				System.out.println("Product Cost:" + product.getProductCost());
			} else if (object instanceof String) {
				System.out.println("String Object Is:" + object.toString());
			} else if (object instanceof Date) {
				Date date = (Date) object;
				System.out.println("Date Object Is:" + date);
			} else if (object instanceof Integer) {
				// Converting Into primitive Value
				// int intValue = ((Integer) object).intValue();
				// Auto Un-Boxing Feature JDK 1.5 Version
				int intValue = (Integer) object;
				System.out.println(intValue);
				listIterator.remove();
			} else {
				System.out.println(object);
			}
		}
		System.out.println("**********************************************");
		System.out.println("By Using For Each Loop");
		System.out.println("**********************************************");
		for (Object object : list) {
			if (object instanceof Product) {
				Product product = (Product) object;
				System.out.println("Product Id:" + product.getProductId());
				System.out.println("Product Name:" + product.getProductName());
				System.out.println("Product Cost:" + product.getProductCost());
			} else if (object instanceof String) {
				System.out.println("String Object Is:" + object.toString());
			} else if (object instanceof Date) {
				Date date = (Date) object;
				System.out.println("Date Object Is:" + date);
			} else if (object instanceof Integer) {
				// Converting Into primitive Value
				// int intValue = ((Integer) object).intValue();
				// Auto Un-Boxing Feature JDK 1.5 Version
				int intValue = (Integer) object;
				System.out.println(intValue);
				listIterator.remove();
			} else {
				System.out.println(object);
			}
		}
		System.out.println("End Of Main Method");
	}
}
