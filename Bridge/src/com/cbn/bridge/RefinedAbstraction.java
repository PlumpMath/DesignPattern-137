package com.cbn.bridge;
/**
 * 修正抽象化角色
 * @author boning
 *
 */
public class RefinedAbstraction extends Abstraction{
	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}

	/**
	 * 某个商业方法在修正抽象化角色的实现
	 */
	@Override
	public void operation() {
		super.operation();
	}
}
