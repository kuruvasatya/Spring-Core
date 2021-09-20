package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Employee;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("singleton.xml");
//		Employee e1 = (Employee) ac.getBean("emp");
//		e1.setEmpName("satya");
//		
//		// references the existing bean in spring container...
//		Employee e2 = (Employee) ac.getBean("emp");
//		e2.setEmpName("ganesh");
//
//		e1.display();
//		e2.display();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("prototype.xml");
		Employee e1 = (Employee) ac.getBean("emp");
		e1.setEmpName("satya");
		
		// references the existing bean in spring container...
		Employee e2 = (Employee) ac.getBean("emp");
		e2.setEmpName("ganesh");

		e1.display();
		e2.display();

	}

}
