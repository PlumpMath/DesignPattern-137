package com.cbn.observer;
/**
 * 抽象观察者角色
 * 为所有的具体观察者定义一个接口，在得到主题的通知时更新自己。
 * @author boning
 *
 */
public interface Observer {
	/**
	 * 调用这个方法会更行自己
	 */
	void update();
}
