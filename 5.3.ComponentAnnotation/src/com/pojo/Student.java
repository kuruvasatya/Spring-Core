package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("studentbean")
public class Student {
	
	/*
	 * 1. @Component tries to create a bean with the name of the decapitalized class name
	 * 2. If a bean is also created in xml file, that bean will also be created 
	 * 3. If the name of bean in xml file is decapitalized class name then component scan doesnt create new bean
	 */
	
	String name = "satya";
	@Autowired
	Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

	
}
