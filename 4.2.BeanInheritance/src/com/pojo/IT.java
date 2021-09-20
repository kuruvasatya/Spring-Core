package com.pojo;

public class IT extends Employee {
	private String subject;

	public IT(String empId, String empName, String subject) {
		super(empId, empName);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "IT [subject=" + subject + " employee " + empName + "]";
	}

}
