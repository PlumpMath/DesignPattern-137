package com.cbn.mediator;
/**
 * 具体同事类1
 * @author boning
 *
 */
public class Colleague1 extends Colleague{

	public Colleague1(Mediator m) {
		super(m);
	}

	@Override
	public void action() {
		System.out.println("同事1收到了信息");
	}

	@Override
	public void operation() {
		super.getMediator().colleagueChanged(this);
	}

}
