package com.cbn.proxy;

public class RealSubject extends Subject{

	@Override
	public void request() {
		System.out.println("来自真实主题的调用");
	}

}
