package com.cbn.factorymethod;

public class AppleGradener implements IFruitFactory {

	@Override
	public IFruit factory() {
		return new Apple();
	}

}
