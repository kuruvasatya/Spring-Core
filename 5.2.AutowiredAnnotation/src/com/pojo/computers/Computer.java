package com.pojo.computers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.pojo.Hardware;
import com.pojo.Software;

public class Computer {
	
	/*
	 * 1. Searches the XML file byType
	 * 2. If multiple beans of same type then searches using byName
	 * 3. If byName fails then throws error
	 */
	
	// Autowire byType -> byName
	@Autowired
	@Qualifier("hard1")
	Hardware hardware;
	
	// Autowire byType
	@Autowired
	Software software;

	@Override
	public String toString() {
		return "Computer [hardware=" + hardware + ", software=" + software + "]";
	}
}
