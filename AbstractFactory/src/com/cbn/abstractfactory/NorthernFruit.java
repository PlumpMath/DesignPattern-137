package com.cbn.abstractfactory;
/**
 * 亚热带水果
 * @author boning
 *
 */
public class NorthernFruit implements IFruit{

	@Override
	public void plant() {
		System.out.println("亚热带水果种植...");
	}

	@Override
	public void grow() {
		System.out.println("亚热带水果成长...");
	}

	@Override
	public void harvest() {
		System.out.println("亚热带水果收割...");
	}

}
