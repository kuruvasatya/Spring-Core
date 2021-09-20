package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Satya") 
	String name;

	@Autowired
	Address address;
	@Autowired
	CourseId courseId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public CourseId getCourseId() {
		return courseId;
	}

	public void setCourseId(CourseId courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", courseId=" + courseId + "]";
	}

}
