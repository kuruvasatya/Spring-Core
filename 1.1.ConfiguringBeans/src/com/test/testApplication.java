package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Bus;

public class testApplication {
	public static void main(String args[])
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("vehicle.xml");
		
		// all the beans for pojo classes will be created in above step
		
		// to access specific bean
		Bus bus = ac.getBean("bus", Bus.class);
		bus.start();
		
	}

}
