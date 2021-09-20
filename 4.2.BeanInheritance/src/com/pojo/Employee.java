package com.pojo;

public class Employee {
	private String empId;
	protected String empName;

	public Employee(String empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
