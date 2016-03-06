package com.cbn.proxy;
/**
 * 抽象主题角色
 * 申明一个真实主题和代理主题共同的接口，以便可以在任何时候代理主题可以替代真实主题
 * @author boning
 *
 */
abstract public class Subject {
	abstract public void request();
}
