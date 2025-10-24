package com.design.patterns.bstructural.adecorator;

public class CoffeeDecoratorMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() +" --> price is "+coffee.getPrice());
		Coffee coffeeMilk = new MilkDecorator(coffee);
		System.out.println(coffeeMilk.getDescription() +" --> price is "+coffeeMilk.getPrice());
		Coffee coffeeSugar = new SugurDecorator(coffeeMilk);
		System.out.println(coffeeSugar.getDescription() +" --> price is "+coffeeSugar.getPrice());

	}

}
