package com.cbn.factorymethod;

/**
 * 将简单工厂中的工厂方法抽象出来，原来的全能角色不在存在，将具体的工厂方法实现交给子类实现
 * 
 * @author boning
 *
 */
public interface IFruitFactory {
	IFruit factory();
}
