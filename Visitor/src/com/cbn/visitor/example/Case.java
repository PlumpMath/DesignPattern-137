package com.cbn.visitor.example;
/**
 * 机箱
 * @author boning
 *
 */
public class Case extends Equipment{

	@Override
	public double price() {
		return 30.00d;
	}

	@Override
	public void accept(Visitor vis) {
		System.out.println("机箱被访问了...");
		vis.visitCase(this);
	}
	
}
