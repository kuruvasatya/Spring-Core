package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Configure;
import com.pojo.Student;

public class Test {

	public static void printStudent(Student student) {
		System.out.println("\n\n******************Your details*****************");
		System.out.printf("Name: %18s\n", student.getName());
		System.out.printf("Address:%18s\n", student.getAddress());
		System.out.printf("Course Enrolled:%18s", student.getCourseId());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		Student student = ac.getBean("student", Student.class);
		printStudent(student);
	}

}
