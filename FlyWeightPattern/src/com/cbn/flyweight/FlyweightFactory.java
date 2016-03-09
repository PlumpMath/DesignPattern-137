package com.cbn.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 * 负责创建和管理享元角色。本角色必须、保证享元对象可以被系统适当的共享。
 * @author boning
 *
 */
public class FlyweightFactory {
	private HashMap<Character,Flyweight> flies = new HashMap<>();
	private Flyweight inkFlyweight;
	public Flyweight factory(Character state) {
		// TODO Auto-generated constructor stub
		if(flies.containsKey(state)){
			return (Flyweight) flies.get(state);
		}else{
			Flyweight fly = new ConcreteFlyweight(state);
			flies.put(state,fly);
			return fly;
		}
	}
}
