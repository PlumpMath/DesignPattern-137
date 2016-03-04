package com.cbn.simplefactory;

public class Strawberry implements IFruit {
	@Override
	public void grow() {
		log("生长蓝莓");
	}

	@Override
	public void harvest() {
		log("收割蓝莓");
	}

	@Override
	public void plant() {
		log("种植蓝莓");
	}

	private static void log(String msg) {
		System.out.println(msg);
	}

}
