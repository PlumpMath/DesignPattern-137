package com.cbn.mediator;

abstract public class Colleague {
	private Mediator mediator;//包含调停者的一个引用
	
	public Colleague(Mediator m) {
		this.mediator = m;
	}
	
	/**
	 * 一个抽象的商业方法，这个方法叫做行动方法，一个同事对象在得知其他对象有变化时，会执行这个操作
	 */
	public abstract void action();
	/**
	 * 在需要跟其他同事通信的时候，通知调停者对象
	 */
	public abstract void operation();
	
	public void change(){
		mediator.colleagueChanged(this);
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	
	
}
