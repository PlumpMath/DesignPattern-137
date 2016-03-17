package com.cbn.mediator.example;

public abstract class Colleague {
	//持有一个调停者对象
	private Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}
	
	
}
