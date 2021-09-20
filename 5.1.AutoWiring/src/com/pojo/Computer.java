package com.pojo;

import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	Hardware hardware;
	Software software;

	// for using autowire by construtor using this, else u can ignore this
//	public Computer(Hardware hardware, Software software) {
//		super();
//		this.hardware = hardware;
//		this.software = software;
//	}

	public Hardware getHardware() {
		return hardware;
	}

	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	@Override
	public String toString() {
		return "Computer [hardware=" + hardware + ", software=" + software + "]";
	}
}
