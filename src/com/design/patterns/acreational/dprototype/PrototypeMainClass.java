package com.design.patterns.acreational.dprototype;

public class PrototypeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("car1", "2021-1234", "White", 858156.00);
		Car car2 = car1.clone();
		car2.setColor("Red");
		Car car3 = car1.clone();
		car3.setColor("Black");
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}

}
