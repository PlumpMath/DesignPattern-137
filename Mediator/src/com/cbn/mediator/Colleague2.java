package com.cbn.mediator;
/**
 * 具体同事类2
 * @author boning
 *
 */
public class Colleague2 extends Colleague{

	public Colleague2(Mediator m) {
		super(m);
	}

	@Override
	public void action() {
		System.out.println("同事2得到信息了");
	}

	@Override
	public void operation() {
		super.getMediator().colleagueChanged(this);
	}

}
