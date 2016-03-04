package com.cbn.factorymethod;
/**
 * 针对一个产品结构
 * @author boning
 *
 */
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
