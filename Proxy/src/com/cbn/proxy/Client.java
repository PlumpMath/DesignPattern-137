package com.cbn.proxy;
/**
 * 代理模式
 * 抽象主题角色：声明了真实主题和代理主题的共同接口，这样一来在任何可以使用真实主题的地方都可以使用代理主题
 * 代理主题角色：代理主题角色内部含有对真实主题的引用，从而可以在任何时候操作真实主题对象
 * 真实主题角色：定义了代理角色所代表的真实对象
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.request();
	}
}
