package com.design.patterns.acreational.asingleton;

public enum EnumSingleton {

	INSTANCE;

	public static void doMorething() {
		System.out.println("Enum Singleton Approach.....");
	}

	/*
	 * An enum type is a special type of class.
	 * 
	 * Your enum will actually be compiled to something like
	 * 
	 * public final class MySingleton { 
	 * 		public final static MySingleton INSTANCE =
	 * 		new MySingleton(); private MySingleton(){} 
	 * } 
	 * 
	 * When your code first accesses
	 * INSTANCE, the class MySingleton will be loaded and initialized by the JVM.
	 * This process initializes the static field above once (lazily).
	 */
	
	/*
	 * Prefer Enum Singleton: For most new development, the Enum Singleton is the simplest, most robust, and 
	 * safest way to implement the pattern, as it inherently handles thread safety, serialization, and reflection issues.
	 */
}
