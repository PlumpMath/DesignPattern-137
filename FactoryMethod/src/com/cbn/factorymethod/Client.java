package com.cbn.factorymethod;

public class Client {
	public static void main(String[] args) {
		IFruit fruit;
		IFruitFactory factory = new AppleGradener();
		fruit = factory.factory();
		fruit.plant();
		fruit.grow();
		fruit.harvest();
		fruit = null;
	}
}
