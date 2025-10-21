package com.design.patterns.acreational.singleton;

public class SingletonH {
	//Bill Pugh came up with a different approach to create the Singleton class using an inner static helper class as below.
	//this way of creating Singleton instance doesn’t violates Singleton Principle.
	
	private SingletonH() {
		System.out.println("Creating.....");
	}
	
	static class Holder{
		static final SingletonH INSTANCE= new SingletonH(); //lazy
	
	}
	
	public static SingletonH getInstance() {
		return Holder.INSTANCE;
	}

	public static void main(String[] args) {

		SingletonH s1= SingletonH.getInstance();
		SingletonH s2= SingletonH.getInstance();
		SingletonH s3= SingletonH.getInstance();
		
		System.out.println("Hashcode of Object s1: " +s1.hashCode());
		System.out.println("Hashcode of Object s2: " +s2.hashCode());
		System.out.println("Hashcode of Object s3: " +s3.hashCode());

	}

}
