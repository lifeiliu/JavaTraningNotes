package com.marlabs.day1;

public class EmployeeDemo {// Execution Logic Class
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		Employee employee = new Employee();
		System.out.println(employee);
		employee.displayEmployeeDetails();
		employee.empNumber = 111;
		employee.empName = "AAA";
		employee.empType = "Contract";
		employee.empBasic = 9056.34d;
		employee.empComm = 2345;
		employee.empDeptNumber = 10;
		// employee.empPassWord = "Guest@123";
		employee.displayEmployeeDetails();

		Employee employee1 = new Employee();
		System.out.println(employee1);
		employee1.displayEmployeeDetails();
		employee1.empNumber = 222;
		employee1.empName = "BBB";
		employee1.empType = "Contract";
		employee1.empBasic = 9056.34d;
		employee1.empComm = 2000;
		employee1.empDeptNumber = 20;
		// employee1.empPassWord = "Guest@123";
		employee1.displayEmployeeDetails();

		Employee employee2 = new Employee();
		employee2.displayEmployeeDetails();
		employee2.doInitialization();
		employee2.displayEmployeeDetails();
		employee2.setEmpPassWord("Admin@123");
		System.out.println(employee2.getEmpPassWord());

		Employee employee3 = new Employee();
		System.out.println(employee3);
		employee3.displayEmployeeDetails();
		employee3.doInitialization(201, "Srini", "Permanent", 9856.25d, 2345,
				10, "Guest@123");
		employee3.displayEmployeeDetails();
		System.out.println("End Of Main Method");
	}
}
