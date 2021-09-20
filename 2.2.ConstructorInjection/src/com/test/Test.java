package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("employee.xml");
		Employee e = (Employee) ac.getBean("emp");
		System.out.println(e);
	}

}
