package com.marlabs.day1.constructors;

public class EmployeeConsDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		Employee employee = new Employee();
		System.out.println(employee);
		employee.displayEmployeeDetails();

		Employee employee2 = new Employee();
		System.out.println(employee2);
		employee2.displayEmployeeDetails();

		Employee employee3 = new Employee(2001, "Srinivas", "Contract",
				9563.20, 2500, 10, "Guest@123");
		System.out.println(employee3);
		employee3.displayEmployeeDetails();

		Employee employee4 = new Employee(3001, "Vasu", "Contract", 9563.20,
				2500, 20, "Guest@123");
		System.out.println(employee4);
		employee4.displayEmployeeDetails();

		Employee employee5 = new Employee(employee3);
		System.out.println(employee5);
		employee5.displayEmployeeDetails();

		if (employee3 == employee5) {
			System.out.println("Pointing To Same Memory Locations");
		} else {
			System.out.println("Both Are Two Different Memory Locations");
		}
		System.out.println("End Of Main Method");
	}
}
