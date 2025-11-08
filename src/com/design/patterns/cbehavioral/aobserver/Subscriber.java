package com.design.patterns.cbehavioral.aobserver;

public class Subscriber implements Observer{
	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name+" recieved message "+message);
	}
	
	
}
