package com.design.patterns.bstructural.adecorator;

public class SugurDecorator extends CoffeeDecorator {

	public SugurDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " + Sugur";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 1.0;
	}

}
