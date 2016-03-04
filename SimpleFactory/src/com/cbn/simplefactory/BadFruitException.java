package com.cbn.simplefactory;

/**
 * 如果客户端调用了不合法的产品种类则抛出这个异常
 * 
 * @author boning
 *
 */
public class BadFruitException extends Exception {
	public BadFruitException(String msg) {
		super(msg);
	}

}
