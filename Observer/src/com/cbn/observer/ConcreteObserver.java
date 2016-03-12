package com.cbn.observer;
/**
 * 具体观察者：
 * @author boning
 *
 */
public class ConcreteObserver implements Observer{

	@Override
	public void update() {
		System.out.println("我被通知自己更新了"+this.toString());
	}

}
