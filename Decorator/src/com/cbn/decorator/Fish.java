package com.cbn.decorator;

public class Fish extends Change{
	public Fish(TheGreatestSage sage) {
		super(sage);
	}
	@Override
	public void move() {
		super.move();
		System.out.println("可以游泳");
	}
	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("鱼自带的功能");
	}

}
