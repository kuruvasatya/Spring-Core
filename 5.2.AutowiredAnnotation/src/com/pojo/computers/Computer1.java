package com.pojo.computers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.pojo.Hardware;
import com.pojo.Software;

public class Computer1 {
	Hardware hardware;
	Software software;

	// Autowire by constructor
	@Autowired
	public Computer1(Hardware hardware, Software software) {
		super();
		this.hardware = hardware;
		this.software = software;
	}

	@Override
	public String toString() {
		return "Computer [hardware=" + hardware + ", software=" + software + "]";
	}
}
