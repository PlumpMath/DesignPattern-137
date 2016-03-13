package com.cbn.memento.example;
/**
 * 负责人角色
 * 
 * @author boning
 *
 */
public class Caretaker {
	// 保存备忘录对象，这个备忘录，除了发起人对象外，其他对象都不可以访问改动
	private MementoIF memento;
	

	public MementoIF retrieveMemento() {
		return this.memento;
	}

	public void saveMemento(MementoIF memento) {
		this.memento = memento;
	}
}
