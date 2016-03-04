package com.cbn.factorymethod;

public class StrawBerry implements IFruit {

	@Override
	public void grow() {
		log("蓝莓在成长");
	}

	@Override
	public void plant() {
		log("蓝莓被种植");
	}

	@Override
	public void harvest() {
		log("蓝莓收割了");
	}

	private static void log(String string) {
		System.out.println(string);
	}
}
