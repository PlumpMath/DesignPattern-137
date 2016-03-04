package com.cbn.abstractfactory;

public class NorthernGardener implements IGardener{

	@Override
	public IFruit createFruit() {
		return new NorthernFruit();
	}

	@Override
	public IVeggie createVeggie() {
		return new NorthernVeggie();
	}

}
