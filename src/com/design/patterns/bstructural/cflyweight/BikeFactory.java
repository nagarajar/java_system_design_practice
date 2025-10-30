package com.design.patterns.bstructural.cflyweight;

import java.util.HashMap;
import java.util.Map;

public class BikeFactory {
	private static final Map<String, Bike> bikeMap = new HashMap<>();
	
	public static Bike getBike(String model, int engineCC) {
		String key = model+"-"+engineCC;
		Bike bike = bikeMap.get(key);
		
		if(bike == null) {
			bike = new HondaBike(model, engineCC);
			bikeMap.put(key, bike);
			System.out.println("Created Honda "+model+" ("+engineCC+" cc)");
		}
		return bike;
	}
}
