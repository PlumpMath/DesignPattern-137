package com.cbn.abstractfactory;

public class TropicalGardener implements IGardener {

	@Override
	public IFruit createFruit() {
		return new TropicalFruit();
	}

	@Override
	public IVeggie createVeggie() {
		return new TropicalVeggie();
	}

}
