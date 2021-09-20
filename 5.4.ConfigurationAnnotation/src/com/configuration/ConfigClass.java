package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pojo.*;

@Configuration
@ComponentScan(basePackages="com")
public class ConfigClass {

	@Bean
	public Software softwareBean() {
		return new Software();
	}

	@Bean
	public Hardware hardwareBean() {
		return new Hardware();
	}

}
