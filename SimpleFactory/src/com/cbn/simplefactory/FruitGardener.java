package com.cbn.simplefactory;

/**
 * 根据客户端的要求给出不同种类的水果，并且抛出BadFruitException
 * 
 * @author boning
 *
 */
public class FruitGardener {
	/**
	 * 静态工厂方法
	 * 
	 */
	public static IFruit factory(String which) throws BadFruitException {
		if ("apple".equalsIgnoreCase(which)) {
			return new Apple();
		} else if ("grape".equalsIgnoreCase(which)) {
			return new Grape();
		} else if ("strawberry".equalsIgnoreCase(which)) {
			return new Strawberry();
		} else {
			throw new BadFruitException("Bad Fruit Request");
		}
	}
}
