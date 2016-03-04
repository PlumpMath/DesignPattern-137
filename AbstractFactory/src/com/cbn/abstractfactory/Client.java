package com.cbn.abstractfactory;
/**
 * 针对多个产品结构
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		/*
		 * 在大棚种植热带产品
		 */
		IGardener gardener = new TropicalGardener();
		IFruit fruit = gardener.createFruit();
		fruit.plant();
		fruit.grow();
		fruit.harvest();
		IVeggie veggie = gardener.createVeggie();
		veggie.plant();
		veggie.harvest();
	}
}
