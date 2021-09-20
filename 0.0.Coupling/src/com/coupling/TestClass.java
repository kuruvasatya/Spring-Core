package com.coupling;

import com.coupling.looseCoupling.Bus;
import com.coupling.looseCoupling.Car;
import com.coupling.looseCoupling.Train;
import com.coupling.looseCoupling.Transport;
//import com.coupling.tightCoupling.Transport;

public class TestClass {

	public static void main(String[] args) {
		//Tight Coupling
//		Transport transport = new Transport();
//		transport.start();
		
		//loose coupling
		Transport transport1 = new Bus();
		Transport transport2 = new Train();
		transport1.start();
		transport2.start();
		
		// suppose we need to add another kind of transport
		// we dont need to change other files, just we need to have new class car
		Transport transport3 = new Car();
		transport3.start();
	}

}
