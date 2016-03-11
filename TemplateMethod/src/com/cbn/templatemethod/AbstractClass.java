package com.cbn.templatemethod;
/**
 * 抽象模板类
 * @author boning
 *
 */
public abstract class AbstractClass {
	/**
	 * 模板方法的声明和实现
	 */
	public void templateMethod(){
		doOperation1();
		doOperation2();
		doOperation3();
	}
	
	protected abstract void doOperation1();
	protected abstract void doOperation2();
	protected abstract void doOperation3();
}
