package com.design.patterns.acreational.singleton;

public class EagerInitialization {
	private static EagerInitialization instance = new EagerInitialization();
	
	private EagerInitialization(){
		
	}
	
	public static EagerInitialization getInstance() {
		return instance;
	}
}
