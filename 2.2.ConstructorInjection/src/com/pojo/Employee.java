package com.pojo;

public class Employee {
	private String empId;
	private String empName;
	private double empSal;
	
	public Employee() {
		super();
	}

	public Employee(String empId) {
		super();
		this.empId = empId;
	}

	public Employee(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public Employee(String empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
