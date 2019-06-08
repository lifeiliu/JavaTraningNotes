package com.marlabs.day1.constructors;

public class Employee {
	int empNumber;
	String empName;
	String empType;
	double empBasic;
	double empComm;
	int empDeptNumber;
	private String empPassWord;

	/**
	 * @return the empPassWord
	 */
	public String getEmpPassWord() {
		return empPassWord;
	}

	/**
	 * @param empPassWord
	 *            the empPassWord to set
	 */
	public void setEmpPassWord(String empPassWord) {
		this.empPassWord = empPassWord;
	}

	public Employee() {
		System.out.println("I AM From Default Constructor");
		empNumber = 222;
		empName = "BBB";
		empType = "Contract";
		empBasic = 9056.34d;
		empComm = 2000;
		empDeptNumber = 20;
		empPassWord = "Guest@123";
	}

	/**
	 * @param empNumber
	 * @param empName
	 * @param empType
	 * @param empBasic
	 * @param empComm
	 * @param empDeptNumber
	 * @param empPassWord
	 */
	public Employee(int empNumber, String empName, String empType,
			double empBasic, double empComm, int empDeptNumber,
			String empPassWord) {
		System.out.println("I AM From Parameterized Constructor");
		this.empNumber = empNumber; // this at Variable Level
		this.empName = empName;
		this.empType = empType;
		this.empBasic = empBasic;
		this.empComm = empComm;
		this.empDeptNumber = empDeptNumber;
		this.empPassWord = empPassWord;
	}

	// data type a is a variable
	// a is a variable of type int
	// Object Parameterized Constructor
	// tempObject is a Variable of type Employee
	public Employee(Employee tempObject) {
		System.out.println("I Am From Copy Constructor");
		empNumber = tempObject.empNumber;
		empName = tempObject.empName;
		if ("Contract".equals(tempObject.empType)) {
			empType = "Permanent";
			empBasic = tempObject.empBasic + 1500;
			empComm = tempObject.empComm + 250;
		}
		empPassWord = tempObject.empPassWord;
		empDeptNumber = tempObject.empDeptNumber;
	}

	public void displayEmployeeDetails() {
		System.out.println("************************************");
		System.out.println("Employee Number:" + "\t" + empNumber);
		System.out.println("Employee Name:" + "\t" + empName);
		System.out.println("Employee Type:" + "\t" + empType);
		System.out.println("Employee Salary:" + "\t" + empBasic);
		System.out.println("Employee Commission:" + "\t" + empComm);
		System.out
				.println("Employee Department Number:" + "\t" + empDeptNumber);
		System.out.println("************************************");
	}
}
