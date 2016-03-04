package com.cbn.abstractfactory;

public class NorthernVeggie implements IVeggie{

	@Override
	public void plant() {
		System.out.println("亚热带蔬菜种植...");		
	}

	@Override
	public void harvest() {
		System.out.println("亚热带蔬菜收割...");
	}

}
