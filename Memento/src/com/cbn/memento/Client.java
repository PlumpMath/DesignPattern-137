package com.cbn.memento;

/**
 * 备忘录模式，快照模式 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象
 * 
 * 备忘录角色，将发起人对象的内部状态存储起来，可以保护其内容不被发起人对象之外的任何对象所读取。 宽接口、窄接口
 * 发起人角色，创建一个含有当前的内部状态的备忘录对象 负责人角色，负责保存备忘录对象
 * 
 * @author boning
 *
 */
public class Client {
	private static Originator o = new Originator();
	private static Caretaker c1 = new Caretaker();
	private static Caretaker c2 = new Caretaker(o);

	public static void main(String[] args) {
		// test1();
		test2();
	}

	/*
	 * 白箱 备忘录模式的实现 白箱实现将发起人角色的状态存储在一个大家都看得到的地方，因此破坏了封装性。
	 */
	private static void test1() {
		// 改变负责人对象的状态
		o.setState("打开状态");
		// 创建备忘录对象，并将发起人对象的状态存储起来，交给负责人保存
		c1.saveMemento(o.createMemento());
		// 修改发起人的状态
		o.setState("关闭状态");
		// 恢复发起人对象的状态
		o.restoreMemento(c1.retrieveMemento());
		System.out.println("恢复后的状态为" + o.getState());
	}

	/**
	 * 白箱负责人增强模式
	 */
	private static void test2() {
		o.setState("打开");
		c2.createMemento();
		o.setState("关闭");
		c2.restoreMemento();
		System.out.println("恢复后的状态为" + o.getState());
	}
}
