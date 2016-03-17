package com.cbn.visitor.example;
/**
 * 整台电脑
 * @author boning
 *
 */
public class Pc extends Composite{
	public Pc() {
		super.add(new IntegrateBoard());
		super.add(new HardDisk());
		super.add(new Case());
	}
	@Override
	public void accept(Visitor vis) {
		System.out.println("Pc被访问了...");
		super.accept(vis);
	}
}
