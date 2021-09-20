package com.coupling.tightCoupling;

public class Transport {
	public void start()
	{
		//for invoking bus method
//		Bus bus = new Bus();
//		bus.start();
		
		// for invoking train method
//		Train train = new Train();
//		train.start();
		
		// if the method name in train changed then the method name in this class also need to be changed thats is tight coupling
		Train train = new Train();
		train.run();
		
		
		
	}
}
