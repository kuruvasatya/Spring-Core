package com.pojo;

public class CourseId {
	String name;
	int credits;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "CourseId [name=" + name + ", credits=" + credits + "]";
	}

}
