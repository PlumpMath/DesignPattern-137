package com.cbn.simplefactory;

public class Apple implements IFruit {
	private int treeAge;

	@Override
	public void grow() {
		log("生长苹果");
	}

	@Override
	public void harvest() {
		log("收割苹果");
	}

	@Override
	public void plant() {
		log("种植苹果");
	}

	private static void log(String msg) {
		System.out.println(msg);
	}

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

}
