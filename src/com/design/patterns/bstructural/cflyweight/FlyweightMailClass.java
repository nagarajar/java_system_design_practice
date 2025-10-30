package com.design.patterns.bstructural.cflyweight;

public class FlyweightMailClass {
	public static void main(String[] args) {
		//Flyweight design pattern
		//Minimize the memory usage by sharing data among similar objects
		
		Bike bike1 = BikeFactory.getBike("razor", 200);
		bike1.ride("TN-6455", "Chennai");
		
		Bike bike2 = BikeFactory.getBike("razor", 200);
		bike2.ride("AP-8933", "Hyderabad");
		
		Bike bike3 = BikeFactory.getBike("CBR", 200);
		bike3.ride("KA-6459", "Bangalore");
		
	}
}
