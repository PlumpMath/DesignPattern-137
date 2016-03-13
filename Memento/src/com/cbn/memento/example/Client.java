package com.cbn.memento.example;

/**
 * 双重接口 备忘录模式利用宽接口和窄接口的设计解决了“白箱实现”的破坏封装性问题
 * 
 * 所谓的双重接口就是对某一个对象提供宽接口，而对另一些对象提供窄接口。 黑箱实现！
 * 
 * @author boning
 *
 */
public class Client {
	private static Originator o = new Originator();
	private static Caretaker c = new Caretaker();

	public static void main(String[] args) {
		// 改变发起人对象的状态
		o.setState("打开状态");
		c.saveMemento(o.createMemento());

		// 修改发起人对象的状态
		o.setState("关闭状态");

		// 恢复发起人对象状态
		o.restoreMemento(c.retrieveMemento());
	}
}
