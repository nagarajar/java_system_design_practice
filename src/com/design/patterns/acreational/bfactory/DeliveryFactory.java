package com.design.patterns.acreational.bfactory;

public class DeliveryFactory {
	public static Delivery getDelivery(String deliveryType) {
		switch (deliveryType) {
		case "Van":
			return new VanDelivery();
		case "Bike":
			return new BikeDelivery();
		default:
			throw new IllegalArgumentException("Not selected the valid option");
		}
	}
}
