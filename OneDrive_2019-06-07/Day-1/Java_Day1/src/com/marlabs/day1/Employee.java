package com.marlabs.day1;

public class Employee { // Business Logic Class
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

	public void doInitialization() {
		System.out.println("From doInitialization default Method");
		empNumber = 222;
		empName = "BBB";
		empType = "Contract";
		empBasic = 9056.34d;
		empComm = 2000;
		empDeptNumber = 20;
		empPassWord = "Guest@123";
	}

	public void doInitialization(int empNumber, String empName, String empType,
			double empBasic, double empComm, int empDeptNumber,
			String empPassWord) {
		System.out.println("From doInitialization Parameterized Method");
		this.empNumber = empNumber; // this Keyword at Variable Level
		this.empName = empName;
		this.empBasic = empBasic;
		this.empComm = empComm;
		this.empPassWord = empPassWord;
		this.empType = empType;
		this.empDeptNumber = empDeptNumber;
		this.empPassWord = empPassWord;
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
