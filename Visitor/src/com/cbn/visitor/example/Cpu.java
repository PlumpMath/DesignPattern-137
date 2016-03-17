package com.cbn.visitor.example;

public class Cpu extends Equipment{

	@Override
	public double price() {
		return 800.00d;
	}

	@Override
	public void accept(Visitor vis) {
		System.out.println("Cpu被访问了...");
		vis.visitCpu(this);
	}

}
