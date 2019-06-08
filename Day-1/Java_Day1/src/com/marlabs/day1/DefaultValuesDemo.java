package com.marlabs.day1;

public class DefaultValuesDemo {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean b1;
	String str;
	Object obj;

	public void knowDefaultValues() {
		System.out.println("****************************************");
		System.out.println("default value for byte:" + "\t" + b);
		System.out.println("default value for short:" + "\t" + s);
		System.out.println("default value for int:" + "\t" + i);
		System.out.println("default value for long:" + "\t" + l);
		System.out.println("default value for float:" + "\t" + f);
		System.out.println("default value for double:" + "\t" + d);
		System.out.println("default value for char:" + "\t" + c);
		System.out.println("default value for boolean:" + "\t" + b1);
		System.out.println("default value for String:" + "\t" + str);
		System.out.println("default value for Object:" + "\t" + obj);
		System.out.println("*****************************************");
	}

	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		DefaultValuesDemo demo = new DefaultValuesDemo();
		System.out.println(demo);
		demo.knowDefaultValues();
		System.out.println("End Of Main Method");
	}
}
