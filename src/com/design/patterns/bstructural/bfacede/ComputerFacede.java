package com.design.patterns.bstructural.bfacede;

public class ComputerFacede {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public ComputerFacede() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	
	public void start() {
		cpu.freeze();
		String data = hardDrive.read(0, 5);
		memory.load(data, 0);
		cpu.jump(0);
		cpu.execute();
	}

}
