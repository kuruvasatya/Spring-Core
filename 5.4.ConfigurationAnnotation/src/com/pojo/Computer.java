package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	@Value("satya")
	private String name;
	@Autowired
	private Hardware hardware;
	@Autowired
	private Software software;

	public Computer() {
		System.out.println("I am computer bean..");
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", hardware=" + hardware + ", software=" + software + "]";
	}

}
