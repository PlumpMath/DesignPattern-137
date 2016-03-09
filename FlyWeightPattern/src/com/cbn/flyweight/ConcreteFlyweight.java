package com.cbn.flyweight;
/**
 * 具体享元角色。
 * 如果有内蕴状态的话，需要提供存储空间
 * @author boning
 *
 */
public class ConcreteFlyweight extends Flyweight{
	private Character intrinsicState = null;
	public ConcreteFlyweight(Character state) {
		this.intrinsicState = state;
	}
	@Override
	public void operation(String state) {
		System.out.println("内蕴状态="+intrinsicState+", 外蕴状态"+state);
	}

}
