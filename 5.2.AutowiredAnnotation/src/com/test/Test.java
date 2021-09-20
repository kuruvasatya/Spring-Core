package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.computers.*;

public class Test {
	public static void main(String args[]) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("computer.xml");
		// autowire annotation on reference variables
		// Computer computer = ac.getBean("comp",Computer.class);
		Computer1 computer = ac.getBean("comp", Computer1.class);
		System.out.println(computer);
	}
}
