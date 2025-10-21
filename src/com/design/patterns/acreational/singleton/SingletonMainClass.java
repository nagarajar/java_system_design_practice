package com.design.patterns.acreational.singleton;

public class SingletonMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Refer: https://javatechonline.com/singleton-design-pattern-in-java-with-all-scenarios/
		 * Here are some common use cases for the Singleton Design Pattern in Java:

			1. Logging: A single logging instance can manage log files, ensuring that all log messages are written to the same file without conflicts.
			2. Configuration Management: A configuration manager can load application settings once and provide consistent access to these settings across the application.
			3. Thread Pools: Managing a single pool of threads ensures efficient resource allocation and prevents the overhead of creating new threads repeatedly.
			4. Caching: A single cache instance can store frequently accessed data, improving application performance by reducing redundant data retrieval operations.
			5. Device Drivers: In systems interacting with hardware, a single driver instance can prevent conflicts and ensure proper control over the device. 
				Even within the Java Development Kit (JDK), you can find examples of the Singleton pattern. For instance, java.lang.Runtime and 
				java.awt.Desktop are classic examples where only one instance is needed to manage system-wide resources or desktop interactions
		 */
		//THis will create the 4 instance for each db connection
//		DBConnection db1 = new DBConnection();
//		DBConnection db2 = new DBConnection();
//		DBConnection db3 = new DBConnection();
//		DBConnection db4 = new DBConnection();
		
		//Now apply the single to rules to DBConnection
		DBConnection db1 = DBConnection.getInstance();
		DBConnection db2 = DBConnection.getInstance();
		DBConnection db3 = DBConnection.getInstance();
		DBConnection db4 = DBConnection.getInstance();
		
		System.out.println(db1==db2);
	}

}
