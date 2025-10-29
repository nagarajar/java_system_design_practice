package com.design.patterns.bstructural.bfacede;

public class CPU {
	public void freeze() {
		System.out.println("CPU freezed");
	}
	
	public void jump(int position) {
		System.out.println("CPU jumped to "+position);
	}
	
	public void execute() {
		System.out.println("CPU executed");
	}
}
