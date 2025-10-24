package com.design.patterns.bstructural.adecorator;

public abstract class CoffeeDecorator implements Coffee {
	protected Coffee coffeeDecorator;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffeeDecorator = coffee;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffeeDecorator.getDescription();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return coffeeDecorator.getPrice();
	}
}
