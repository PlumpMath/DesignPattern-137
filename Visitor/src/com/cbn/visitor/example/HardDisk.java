package com.cbn.visitor.example;
/**
 * 硬盘
 * @author boning
 *
 */
public class HardDisk extends Equipment{

	@Override
	public double price() {
		return 200.00d;
	}

	@Override
	public void accept(Visitor vis) {
		System.out.println("硬盘被访问了...");
		vis.visitHardDisk(this);
	}
}
