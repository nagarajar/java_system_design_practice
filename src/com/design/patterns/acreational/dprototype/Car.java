package com.design.patterns.acreational.dprototype;

public class Car implements Prototype{
	private String name;
	private String model;
	private String color;
	private double price;
	
	public Car(String name, String model, String color, double price) {
		this.name = name;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	public Car clone() {
		return new Car(this.name, this.model, this.color, this.price);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
