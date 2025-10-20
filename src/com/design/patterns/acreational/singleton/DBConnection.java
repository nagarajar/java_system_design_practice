package com.design.patterns.acreational.singleton;

public class DBConnection {
	
	private static DBConnection instance;
	
	private DBConnection() {
		System.out.println("Connect to db.....");
	}
	
	public static DBConnection getInstance() {
		if(instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}
}
