package com.cbn.builder;
/**
 * 产品1的创建者角色
 * @author boning
 *
 */
public class ConcreteBuilder1 implements IBuilder{
	private Product1 product = new Product1();
	@Override
	public void buildPart1() {
		product.buildPart1();
	}

	@Override
	public void buildPart2() {
		product.buildPart2();
	}
	
	public Product1 retrieveResult(){
		return product;
	}
}
