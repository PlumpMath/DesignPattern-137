package com.cbn.visitor.example;
/**
 * 主板
 * @author boning
 *
 */
public class MainBoard extends Equipment{

	@Override
	public double price() {
		return 100.00d;
	}

	@Override
	public void accept(Visitor vis) {
		System.out.println("主板被访问了...");
		vis.visitMainBoard(this);
	}

}
