package com.cbn.bridge;
/**
 * 桥梁模式 （JDBC驱动）
 * 将抽象化与实现化脱耦，使二者可以独立变化
 * 使用桥梁模式的关键在于准确地找出这个系统的抽象化角色和具体化角色。
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		RefinedAbstraction client = new RefinedAbstraction(new ConcreteImplementor01());
		client.operation();
		
		//改变桥梁那段的实现方式，例如从mysql驱动切换到oracle驱动
		client.setImplementor(new ConcreteImplementor02());
		client.operation();
	}
}
