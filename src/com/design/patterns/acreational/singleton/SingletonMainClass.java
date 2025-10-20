package com.design.patterns.acreational.singleton;

public class SingletonMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
