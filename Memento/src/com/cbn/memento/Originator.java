package com.cbn.memento;

/**
 * 发起人角色
 * 
 * @author boning
 *
 */
public class Originator {
	private String state;

	/**
	 * 工厂方法，返回一个新的备忘录对象
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("在设定之前，状态为 = " + this.state);
		this.state = state;
		System.out.println("在设定之后，状态为 = " + this.state);
	}

}
