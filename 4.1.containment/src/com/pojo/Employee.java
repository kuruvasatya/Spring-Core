package com.pojo;

public class Employee {

	private String empName;
	private Address address;

	public Employee() {
		System.out.println("Employee bean created...");
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}
}
