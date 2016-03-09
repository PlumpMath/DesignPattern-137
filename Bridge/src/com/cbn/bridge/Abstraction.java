package com.cbn.bridge;
/**
 * 抽象化角色
 * @author boning
 *
 */
abstract public class Abstraction {
	protected Implementor imp;
	
	public Abstraction(Implementor imp) {
		this.imp = imp;
	}
	/**
	 * 某个商业方法
	 */
	public void operation(){
		imp.operationImp();
	}
	public void setImplementor(Implementor imp){
		this.imp = imp;
	}
}
