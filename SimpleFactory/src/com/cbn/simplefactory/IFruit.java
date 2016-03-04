package com.cbn.simplefactory;

/**
 * 简单工厂模式，又叫静态工厂模式，由一个工厂对象类决定创建哪一种产品实例
 * 
 * @author boning
 *
 */
public interface IFruit {
	/**
	 * 生长
	 */
	void grow();

	/**
	 * 收割
	 */
	void harvest();

	/**
	 * 种植
	 */
	void plant();
}
