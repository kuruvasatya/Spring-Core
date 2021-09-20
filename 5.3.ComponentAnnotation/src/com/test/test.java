package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Address;
import com.pojo.Student;

public class test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Student std = ac.getBean("studentbean", Student.class);
		System.out.println(std);
	}

}
