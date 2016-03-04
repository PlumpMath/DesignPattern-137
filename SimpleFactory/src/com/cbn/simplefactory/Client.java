package com.cbn.simplefactory;

public class Client {
	public static void main(String[] args) {
		try {
			IFruit fruit = FruitGardener.factory("apple");
			fruit.plant();
			fruit.grow();
			fruit.harvest();
			fruit = FruitGardener.factory("Strawberry");
			fruit.plant();
			fruit.grow();
			fruit.harvest();
			fruit = null;
		} catch (BadFruitException e) {
			e.printStackTrace();
		}
	}
}
