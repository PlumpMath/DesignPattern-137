package com.cbn.abstractfactory;

/**
 * 热带水果
 * 
 * @author boning
 *
 */
public class TropicalFruit implements IFruit {

	@Override
	public void plant() {
		System.out.println("热带水果种植...");
	}

	@Override
	public void grow() {
		System.out.println("热带水果成长...");
	}

	@Override
	public void harvest() {
		System.out.println("热带水果收割...");
	}

}
