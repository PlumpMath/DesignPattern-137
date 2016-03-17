package com.cbn.mediator;

abstract public class Mediator {
	/**
	 * 事件方法，当自身的状态发生了变化的时候，一个同事对象可以调用这个事件方法来通知调停者，从而更新所有相关的同事对象
	 * @param colleague
	 */
	abstract public void colleagueChanged(Colleague colleague);
}
