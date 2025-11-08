package com.design.patterns.cbehavioral.bstrategy;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Strategy Pattern Overview:
		 *
		 * The Strategy pattern is a behavioral design pattern that enables selecting an algorithm’s behavior at runtime.
		 * It defines a family of algorithms, encapsulates each one, and makes them interchangeable without altering the clients that use them.
		 *
		 * Typical usage:
		 *  - When you want to switch between related algorithms (sorting, payment methods, compression, etc.) in a flexible way.
		 *  - Promotes the Open/Closed Principle by allowing new strategies to be added without modifying client code.
		 *
		 * Key Concepts:
		 *  - Strategy Interface: Declares a common method or set of methods for the algorithms.
		 *  - Concrete Strategies: Implement the Strategy interface with different algorithms.
		 *  - Context: Maintains a reference to a Strategy, and delegates operations to it.
		 *
		 * Benefits:
		 *  - Simplifies code by separating algorithm logic from client usage.
		 *  - Easy to add new algorithms or strategies without changing existing code.
		 *  - Encourages composition over inheritance.
		 *
		 * Example Use Cases:
		 *  - Dynamic selection of sorting algorithms.
		 *  - Different payment or shipping methods.
		 *  - Route planning (car, bike, walking).
		 */
		
		NavigationApp app = new NavigationApp();
		app.setRouteStrategy(new CarRouteStrategy());
		app.navigate("Home", "Office");
		System.out.println("==========================================");
		app.setRouteStrategy(new BikeRouteStrategy());
		app.navigate("Home", "Mall");
		System.out.println("==========================================");
		app.setRouteStrategy(new WalkingRouteStrategy());
		app.navigate("Home", "Park");
		System.out.println("==========================================");
	}

}
