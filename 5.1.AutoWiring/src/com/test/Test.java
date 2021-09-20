package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Computer;

public class Test {
	public static void main(String args[]) {
		// testing byName autowiring
		ApplicationContext ac = new ClassPathXmlApplicationContext("byName.xml");

//		ApplicationContext ac = new ClassPathXmlApplicationContext("byType.xml");
		Computer computer = ac.getBean("comp", Computer.class);
		System.out.println(computer);
	}
}
