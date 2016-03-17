package com.cbn.visitor.example;
/**
 * 集成板，包括cpu和主板
 * @author boning
 *
 */
public class IntegrateBoard extends Composite{
	public IntegrateBoard() {
		super.add(new MainBoard());
		super.add(new Cpu());
	}
	
	@Override
	public void accept(Visitor vis) {
		System.out.println("集成板被访问了...");
		super.accept(vis);
	}
}
