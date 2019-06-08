package com.marlabs.collections.examples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		Map<Integer, String> inputMap = new HashMap<Integer, String>();
		// Map<Integer, String> inputMap = new LinkedHashMap<Integer, String>();
		// Map<Integer, String> inputMap = new TreeMap<Integer, String>();
		int size = inputMap.size();
		System.out.println("Size:" + size);
		boolean isEmpty = inputMap.isEmpty();
		System.out.println("isEmpty:" + isEmpty);
		System.out.println(inputMap.put(101, "AAA"));
		inputMap.put(102, "CCC");
		inputMap.put(103, "BBB");
		inputMap.put(104, "AAA");
		System.out.println(inputMap.put(101, "BBB"));
		size = inputMap.size();
		System.out.println("Size:" + size);
		System.out.println(inputMap);
		inputMap.put(null, "Srini");
		size = inputMap.size();
		System.out.println("Size:" + size);
		System.out.println(inputMap);

		boolean containsKey = inputMap.containsKey(111);
		System.out.println("Contains Key:" + containsKey);
		boolean containsValue = inputMap.containsValue("BBB");
		System.out.println("Contains Value:" + containsValue);

		String value = inputMap.get(104);
		System.out.println(value);
		System.out.println(inputMap.remove(null));
		System.out.println(inputMap);

		System.out.println("keySet Method");
		Set<Integer> keys = inputMap.keySet();
		System.out
				.println("***************************************************");
		for (Integer key : keys) {
			System.out.println("Key:" + key + ": Value :" + inputMap.get(key));
		}
		System.out.println("*************************************************");
		System.out.println("By Using Values Method");
		System.out.println("*************************************************");
		Collection<String> values = inputMap.values();
		for (String valueObj : values) {
			System.out.println(valueObj);
		}
		System.out.println("*************************************************");
		System.out.println("By Using Entry Set Method");
		Set<Entry<Integer, String>> entrySet = inputMap.entrySet();
		System.out.println("*************************************************");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("Entry:==>" + entry);
			System.out.println("Key:" + entry.getKey() + ":" + "Value:"
					+ entry.getValue());
		}
		System.out.println("*************************************************");
		System.out.println("End Of Main Method");
	}
}
