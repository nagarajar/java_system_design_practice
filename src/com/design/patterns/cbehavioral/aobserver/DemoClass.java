package com.design.patterns.cbehavioral.aobserver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Observer Pattern Overview:
		 *
		 * The Observer pattern is a behavioral design pattern that enables a "one-to-many" dependency between objects.
		 * When the subject (also called "observable") changes its state, all its dependent observers are notified and updated automatically.
		 *
		 * Typical usage:
		 *  - Useful for implementing distributed event handling systems, such as GUI frameworks, event buses, or subscription models.
		 *  - Decouples the subject from the observer, allowing observers to register/unregister dynamically.
		 *
		 * Key Concepts:
		 *  - Subject: The object holding the core state, which observers watch for changes.
		 *  - Observer: Objects that register interest in the subject; when notified, they perform an action.
		 *
		 * Benefits:
		 *  - Promotes loose coupling between objects.
		 *  - Supports dynamic addition/removal of observers.
		 *  - Easy to maintain and extend system behavior.
		 *
		 * Example Use Cases:
		 *  - Implementing event listeners in UI frameworks.
		 *  - Subscribing to changes in data models (like MVC architectures).
		 *  - Real-time notification systems.
		 */
		
		YouTubeChannel channel = new YouTubeChannel();
		
		Observer s1 = new Subscriber("Nagaraja");
		Observer s2 = new Subscriber("Anil");
		Observer s3 = new Subscriber("Satish");
		
		channel.subscribe(s1);
		channel.subscribe(s2);
		channel.subscribe(s3);
		
		channel.uploadPost("Core Java Updates");
		System.out.println("=========================================================");
		channel.uploadVideo("Java 8 new features");
		System.out.println("=========================================================");
		channel.unsubscribe(s3);
		channel.uploadVideo("Java virtual threads");

	}

}
