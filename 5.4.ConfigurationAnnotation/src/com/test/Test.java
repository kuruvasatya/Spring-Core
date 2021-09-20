package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pojo.Computer;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
				com.configuration.ConfigClass.class);
		Computer c = ac.getBean("computer", Computer.class);
		System.out.println(c);

	}

}
