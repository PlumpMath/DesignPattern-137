package com.cbn.memento;

/**
 * 负责人角色,用来保存备忘录
 * 
 * 白箱增强负责人角色
 * 
 * 如果能让负责人角色调用备忘录角色和发起人角色，进行备忘录创建和根据备忘录恢复发起人状态，
 * 那么客户端便不再需要协调备忘录角色和发起人角色，而只需要调用负责人角色即可。要做到这点，负责人角色必须持有一个对发起人角色的引用
 * 
 * @author boning
 *
 */
public class Caretaker {
	private Memento memento;
	private Originator originator;

	public Caretaker(Originator originator) {
		this.originator = originator;
	}

	public Caretaker() {
	}

	public Memento retrieveMemento() {
		return this.memento;
	}

	public void saveMemento(Memento memento) {
		this.memento = memento;
	}

	public void restoreMemento() {
		this.originator.restoreMemento(memento);
	}

	public void createMemento() {
		this.memento = this.originator.createMemento();
	}
}
