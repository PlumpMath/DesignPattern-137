package com.cbn.visitor.example;

public class PriceVisitor extends Visitor{
	private float total;
	
	public PriceVisitor() {
		total = 0;
	}
	/**
	 * 商业方法
	 * @return
	 */
	public float value(){
		return total;
	}
	
	@Override
	public void visitHardDisk(HardDisk disk) {
		total += disk.price();
	}

	@Override
	public void visitMainBoard(MainBoard board) {
		total += board.price();
	}

	@Override
	public void visitCpu(Cpu cpu) {
		total += cpu.price();
	}

	@Override
	public void visitCase(Case case1) {
		total += case1.price();
	}

	@Override
	public void visitIntegratedBoard(IntegrateBoard board) {
		total += board.price();
	}

}
