package com.cbn.builder;

public class ConcreteBuilder2 implements IBuilder{
	private Product2 product = new Product2();
	@Override
	public void buildPart1() {
		product.buildPart1();
	}

	@Override
	public void buildPart2() {
		product.buildPart2();
	}
	
	public Product2 retrieveResult(){
		return product;
	}

}
