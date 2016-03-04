package com.cbn.factorymethod;

public class Apple implements IFruit {

	@Override
	public void grow() {
		log("苹果在生长");
	}

	@Override
	public void plant() {
		log("苹果被种植");
	}

	@Override
	public void harvest() {
		log("苹果可以收获");
	}

	private static void log(String string) {
		System.out.println(string);
	}
}
