package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Employee;
import com.pojo.IT;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		// Employee emp = ac.getBean("emp1",Employee.class);
		IT std1 = (IT) ac.getBean("std1");
		System.out.println(std1);

	}

}
