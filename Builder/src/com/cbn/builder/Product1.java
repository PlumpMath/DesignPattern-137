package com.cbn.builder;

public class Product1 implements IProduct {

	@Override
	public void buildPart1() {
		System.out.println("构建产品1的零件1...");
	}

	@Override
	public void buildPart2() {
		System.out.println("构建产品1的零件2...");
	}
	public void operation(){
		//商业方法
		System.out.println("产品1已构建完成...");
	}
}
