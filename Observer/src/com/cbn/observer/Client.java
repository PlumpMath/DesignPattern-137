package com.cbn.observer;
/**
 * 观察者模式，发布-订阅模式
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		Observer s1 = new ConcreteObserver();
		Observer s2 = new ConcreteObserver();
		Observer s3 = new ConcreteObserver();
		Subject subject = new ConcreteSubject();
		subject.attach(s1);
		subject.attach(s2);
		subject.attach(s3);
		subject.notifyObservers();
		
		subject.detach(s1);
		subject.notifyObservers();
	}
}
