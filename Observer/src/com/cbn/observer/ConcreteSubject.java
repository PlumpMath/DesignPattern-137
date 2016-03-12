package com.cbn.observer;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 具体主题角色：将有关在状态存入具体观察者对象；再具体主题的内部状态改变时，给所有登记过的观察者发送通知。
 * @author boning
 *
 */
public class ConcreteSubject implements Subject{
	private HashSet<Observer> map = new HashSet<>();

	@Override
	public void attach(Observer observer) {
		map.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		map.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> ite = map.iterator();
		while(ite.hasNext()){
			ite.next().update();
			
		}
	}
	
	
}
