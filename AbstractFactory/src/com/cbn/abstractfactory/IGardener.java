package com.cbn.abstractfactory;
/**
 * 工厂簇，产品等级个数就是工厂接口中的方法个数
 * 具体工厂实现类的个数=产品簇的个数
 * @author boning
 *
 */
public interface IGardener {
	IFruit createFruit();
	IVeggie createVeggie();
}
