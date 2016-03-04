package com.cbn.builder;
/**
 * 具体产品2
 * @author boning
 *
 */
public class Product2 implements IProduct{

	@Override
	public void buildPart1() {
		System.out.println("构建产品2的零件1...");
	}

	@Override
	public void buildPart2() {
		System.out.println("构建产品2的零件2...");
	}
	public void operation(){
		//商业方法
		System.out.println("产品2已构建完成...");
	}
}
