package com.pojo;

public class Address {
	String city;
	int pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}

}
