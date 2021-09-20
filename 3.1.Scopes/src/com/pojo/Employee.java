package com.pojo;

public class Employee {
	private String empName;

	public Employee() {
		System.out.println("Employee Bean Created.......");
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void display() {
		System.out.println("Welcome " + empName);
	}
}
