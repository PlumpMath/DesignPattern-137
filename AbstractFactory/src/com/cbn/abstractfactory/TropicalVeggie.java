package com.cbn.abstractfactory;
/**
 * 热带蔬菜
 * @author boning
 *
 */
public class TropicalVeggie implements IVeggie {

	@Override
	public void plant() {
		System.out.println("热带蔬菜种植...");
	}

	@Override
	public void harvest() {
		System.out.println("热带蔬菜收割...");
	}

}
