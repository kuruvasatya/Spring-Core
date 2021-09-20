package com.configuration;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.pojo.Address;
import com.pojo.CourseId;

@Configuration
@ComponentScan(basePackages="com")
public class Configure {
	
	Scanner in = new Scanner(System.in);
	
	@Bean
	public Address addressBean() {
		Address address = new Address();
		System.out.println("Enter your city...");
		address.setCity(in.next());
		System.out.println("Enter your pincode...");
		address.setPincode(in.nextInt());
		return address;
	}

	@Bean
	public CourseId courseIdBean() {
		CourseId  course = new CourseId();
		course.setName("Java Programming");
		course.setCredits(5);
		return course;
	}
}
