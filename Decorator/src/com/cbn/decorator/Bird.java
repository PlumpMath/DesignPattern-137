package com.cbn.decorator;

public class Bird extends Change {

	public Bird(TheGreatestSage sage) {
		super(sage);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("我会飞");
	}

	@Override
	public void change() {
		System.out.println("鸟儿自带的功能");
	}

}
