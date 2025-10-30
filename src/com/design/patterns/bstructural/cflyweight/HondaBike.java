package com.design.patterns.bstructural.cflyweight;

public class HondaBike implements Bike{
	private final String brand;
	private final String model;
	private final int engineCC;
	
	public HondaBike(String model, int engineCC) {
		this.brand="Honda";
		this.model=model;
		this.engineCC=engineCC;
	}
	

	@Override
	public void ride(String numberPlate, String location) {
		// TODO Auto-generated method stub
		System.out.println("Riding "+brand+" "+model+" ("+engineCC+" cc) with number plate "+numberPlate+" at "+location);
	}

}
