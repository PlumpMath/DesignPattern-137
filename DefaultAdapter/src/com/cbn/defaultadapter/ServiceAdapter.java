package com.cbn.defaultadapter;
/**
 * 为接口AbstractService提供默认实现
 * 任何继承自抽象类ServiceAdapter的具体类都可以选择它所需要的方法实现，而不必理会其他的不需要的方法。
 * @author boning
 *
 */
public class ServiceAdapter implements AbstractService{

	@Override
	public void serviceOperation1() {
	}

	@Override
	public int serviceOperation2() {
		return 0;
	}

	@Override
	public String serviceOperation3() {
		return null;
	}
	
}
