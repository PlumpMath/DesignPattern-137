package com.cbn.templatemethod;
/**
 * 具体模板类
 * @author boning
 *
 */
public class ConcreteClass extends AbstractClass{

	@Override
	protected void doOperation1() {
		System.out.println("开始进行方法1的调用");
	}

	@Override
	protected void doOperation2() {
		System.out.println("开始进行方法2的调用");
		
	}

	@Override
	protected void doOperation3() {
		System.out.println("开始进行方法3的调用");
		
	}

}
