package com.cbn.simplefactory;

public class Grape implements IFruit {
	private boolean seedless;

	@Override
	public void grow() {
		log("生长葡萄");
	}

	@Override
	public void harvest() {
		log("收割葡萄");
	}

	@Override
	public void plant() {
		log("种植葡萄");
	}

	private static void log(String msg) {
		System.out.println(msg);
	}

	public boolean isSeedless() {
		return seedless;
	}

	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}

}
