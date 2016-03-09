package com.cbn.flyweight.coffee;
/**
 * 具体享元角色
 * @author boning
 *
 */
public abstract class Order {
	//将咖啡卖给客人
	public abstract void serve();
	//返还咖啡的名字
	public abstract String getFlavor();
}
