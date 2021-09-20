package com.pojo.computers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.pojo.Hardware;
import com.pojo.Software;

public class Computer {
	
	// Autowire byName
	@Autowired
	@Qualifier("hard2")
	Hardware hardware;
	
	// Autowire byType
	@Autowired
	Software software;

	@Override
	public String toString() {
		return "Computer [hardware=" + hardware + ", software=" + software + "]";
	}
}
