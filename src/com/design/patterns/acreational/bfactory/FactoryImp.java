package com.design.patterns.acreational.bfactory;

public class FactoryImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Its tightly coupled - both type right == left
		VanDelivery d1 = new VanDelivery();
		d1.delivery();
		
		BikeDelivery d2 = new BikeDelivery();
		d2.delivery();
		
		// Loose coupling - both type right != left
		Delivery dl1 = DeliveryFactory.getDelivery("Van");
		dl1.delivery();
		Delivery dl2 = DeliveryFactory.getDelivery("Bike");
		dl2.delivery();
		Delivery dl3 = DeliveryFactory.getDelivery("Car");
		dl3.delivery();
		
		

	}

}
