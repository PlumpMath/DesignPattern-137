package com.cbn.proxy;

/**
 * 代理主题角色
 * 
 * @author boning
 *
 */
public class ProxySubject extends Subject {
	private Subject origin;

	public ProxySubject(Subject subject) {
		this.origin = subject;
	}

	public ProxySubject() {
	}

	@Override
	public void request() {

		beforeRequest();
		if (origin == null) {
			origin = new RealSubject();
		}
		origin.request();
		afterRequest();
	}

	private void beforeRequest() {
		System.out.println("来自代理主题的before方法");
	}

	private void afterRequest() {
		System.out.println("来自代理主题的after方法");
	}

}
