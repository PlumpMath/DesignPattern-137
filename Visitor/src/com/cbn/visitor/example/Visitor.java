package com.cbn.visitor.example;

public abstract class Visitor {
	public abstract void visitHardDisk(HardDisk disk);
	public abstract void visitMainBoard(MainBoard board);
	public abstract void visitCpu(Cpu cpu);
	public abstract void visitCase(Case case1);
	public abstract void visitIntegratedBoard(IntegrateBoard board);
}
