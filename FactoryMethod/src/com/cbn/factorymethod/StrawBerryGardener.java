package com.cbn.factorymethod;

public class StrawBerryGardener implements IFruitFactory {

	@Override
	public IFruit factory() {
		return new StrawBerry();
	}

}
