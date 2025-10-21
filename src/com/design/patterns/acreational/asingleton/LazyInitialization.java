package com.design.patterns.acreational.asingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazyInitialization {
	private static LazyInitialization instance = null;

	private LazyInitialization() {
		System.out.println("Creating...");
	}

	// 1. Without thread safety - may cause the different object creation
	public static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}

	// 2. with thread safety synchronized
	public synchronized static LazyInitialization getInstanceSynchronized() {
		if (instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}

	// 3. with thread safety synchronized block - After applying synchronize keyword
	// in the getInstance () method the program may
	// execute properly without any issue, but in Java instead of synchronizing
	// whole method we can synchronize only the block of code
	// which is affected while creating instance to escape the extra overhead as
	// below.
	public static LazyInitialization getInstanceSynchronizedBlock() {
		if (instance == null) {
			synchronized (LazyInitialization.class) {
				instance = new LazyInitialization();
			}
		}
		return instance;
	}

	// 4. Double check locking - In rare cases, double-checked locking also breaks
	// the Principle of Singleton
	// Using volatile keyword
	// To address above situation, use volatile keyword at the time of instance
	// declaration. Value of volatile variable will be published only when the
	// change completes. Change to write operation happens before read operation in
	// volatile variable. In fact, all threads will see the same value of variable.
	// private static volatile SingletonT instance=null; //lazy initialization
	public static LazyInitialization getInstanceSynchronizedBlockWithDCL() {
		if (instance == null) { // check 1
			synchronized (LazyInitialization.class) {
				if (instance == null) { // check 2
					instance = new LazyInitialization();
				}
			}
		}
		return instance;
	}

	static void useSingleton() {
//		LazyInitialization singleton = LazyInitialization.getInstance();
//		LazyInitialization singleton = LazyInitialization.getInstanceSynchronized();
//		LazyInitialization singleton = LazyInitialization.getInstanceSynchronizedBlock();
		LazyInitialization singleton = LazyInitialization.getInstanceSynchronizedBlockWithDCL();
		System.out.println("Hashcode of Singleton Object: " + singleton.hashCode());
	}

	public static void main(String[] args) throws Exception {
		//
		ExecutorService service = Executors.newFixedThreadPool(10);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.submit(LazyInitialization::useSingleton);
		service.shutdown();
	}
}
