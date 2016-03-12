package com.cbn.observer;
/**
 * 抽象主题角色：主题角色把所有对观察者对象的引用保存在一个聚集里
 * @author boning
 *
 */
public interface Subject {
	/**
	 * 调用这个方法登记一个新的观察这对象
	 * @param observer
	 */
	public void attach(Observer observer);
	
	/**
	 * 调用这个方法删除一个已经登记过的观察这对象
	 * @param observer
	 */
	public void detach(Observer observer);
	/**
	 * 调用这个方法通知所有登记过的观察者对象
	 */
	void notifyObservers();
}
