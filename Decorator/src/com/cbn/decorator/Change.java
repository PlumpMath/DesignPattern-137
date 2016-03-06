package com.cbn.decorator;

public abstract class Change implements TheGreatestSage {
	private TheGreatestSage sage;

	public Change(TheGreatestSage sage) {
		this.sage = sage;
	}

	@Override
	public void move() {
		sage.move();
	}

	/**
	 * 装饰模式的强化功能
	 */
	public abstract void change();

}
